package ch03;
/*
* 함수형 프로그래밍 방법을 람다식
*
* 익명함수 만들기
* 매개 변수와 매개 변수를 이용한 실행문
* */
public class LambdaExpressionRun {
    public static void main(String[] args) {
        Add add = (x,y)-> {return x+y;};
        System.out.println(add.add(2,3));

        MaxNumberReturn maxNumberReturn = (x,y)->x>y ? x:y;
        System.out.println(maxNumberReturn.getMax(5,3));
    }
}
