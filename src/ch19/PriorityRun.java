package ch19;

class PriorityThread extends Thread{
    @Override
    public void run() {
        int sum =0;
        Thread t = Thread.currentThread();
        System.out.println(t + " start");
        for (int i=0; i<10000; i++){
            sum+=i;
        }
        System.out.println(t + " end");
    }
}

public class PriorityRun {
    public static void main(String[] args) {
        for (int i = Thread.MIN_PRIORITY; i<Thread.MAX_PRIORITY; i++){
            PriorityThread priorityThread = new PriorityThread();
            priorityThread.setPriority(i);
            priorityThread.start();
        }
    }
}
