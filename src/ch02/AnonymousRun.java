package ch02;

class Outer2{
    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i){
        int num = 10;
        class MyRunnable implements Runnable{

            int localNum = 1000;
            @Override
            public void run() {
                System.out.println("Outer2 outNum " + outNum);
                System.out.println("Outer2 sNum " + sNum);
                System.out.println("getRunnable num " + num);
                System.out.println("MyRunnable localNum " + localNum);
                System.out.println("getRunnable params " + i);

            }
        }
        return new MyRunnable();
    }
}

public class AnonymousRun {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable runnable = outer2.getRunnable(100);
        runnable.run();
    }
}
