package ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 스트림 이란
* 자료의 대상과 관계없이 동일한 연산을 수행
* 한번 생성하고 사용한 스트림은 재사용할 수 없음
* 스트림은 중간연산과 최종연산으로 구분됨
*
* */
public class Stream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        for (int n : arr){
//            System.out.println(n);
//        }
        Arrays.stream(arr).forEach(n-> System.out.println(n));

        List<String> strings = new ArrayList<>();
        strings.add("tomas");
        strings.add("edward");
        strings.add("jack");
        java.util.stream.Stream<String> stringStream = strings.stream();
        strings.forEach(s-> System.out.println(s));
        strings.stream().sorted().forEach(s-> System.out.println(s));
        strings.stream().map(s->s.length()).forEach(n-> System.out.println(n));
        strings.stream().filter(s->s.length() >=5).forEach(n-> System.out.println(n));

    }
}
