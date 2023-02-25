package ch01;
/*
* 내부 클래스란?
* 클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많고
* 다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스로 선언해서 사용함
*
*
* */

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass{
        int iNum = 100;
        //스태틱 변수 선언 못함
        void inTest(){
            System.out.println("OutClass num " + num);
            System.out.println("OutClass static num " + sNum);
            System.out.println("inClass num " + iNum);
        }
    }

    //사용할 때 이런식으로 사용
    public void usingInClass(){
        inClass.inTest();
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;
        void inTest(){
            System.out.println("InStaticClass num " + iNum);
            System.out.println("OutClass static num " + sNum);
            System.out.println("InStaticClass num " + sInNum);
        }
    }
}

public class InnerClassRun {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInClass();

        OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
        staticClass.inTest();
    }
}
