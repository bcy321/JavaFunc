package ch03;

//함수형 인터페이스;
//하나의 메서드만 구현
@FunctionalInterface
public interface Add {
    int add(int x, int y);
}
