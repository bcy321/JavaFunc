package ch17;
/*
* 데코레이터 패턴
* 자바의 입출력 스트림은 데코레이터 패턴임
* 여러 데코레이터들을 활용하여 다양한 기능을 제공
* 상속 보다 유연한 구현 방식
* 데코레이터는 다른 데코레이터나 컴포넌트를 포함해야함
* 지속적인 기능의 추가와 제거가 용이함함*
*
* */
public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee.brewing();

        Coffee latte = new Latte(coffee);
        latte.brewing();

        Coffee mocha = new Mocha(new Latte(new Americano()));
        mocha.brewing();
    }
}
