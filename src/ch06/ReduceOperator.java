package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/*
* reduce() 연산
* 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
* T reduce(T identify, BinaryOperator<T> accumulator)
* 최종 연산으로 스트림의 요소를 소모하며 연산을 수행
*
*
* */

class CompareString implements BinaryOperator<String>{
    @Override
    public String apply(String s, String s2) {
        return  s.getBytes().length >= s2.getBytes().length ? s : s2;
    }
}

public class ReduceOperator {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~~~~~","hello","Good Morning","반갑습니다.!!!!!!!!!"};
        String test = Arrays.stream(greetings).reduce("",(s1, s2)->{
            if (s1.getBytes().length >= s2.getBytes().length){
                return s1;
            }
            return s2;
        });
        System.out.println(test);
        System.out.println();
        String value = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(value);
    }
}
