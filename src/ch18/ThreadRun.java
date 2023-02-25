package ch18;
/*
* 작업을 수행하는 단위는 thread
*
* 여러 thread 가 동시에 프로그램이 작업이 동시에 실행되는 효과
*
* */

//class MyThread extends Thread{
//    @Override
//    public void run() {
//        for (int i=0; i<200; i++){
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//    }
//}
class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<200; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}

public class ThreadRun {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
//        th1.start();
//        th2.start();
        MyThread runnable = new MyThread();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");
    }
}
