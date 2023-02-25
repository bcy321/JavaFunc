package ch20;



public class JoinRun extends Thread{

    int start;
    int end;
    int total;

    public JoinRun(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i=start; i<=end; i++){
            total+=i;
        }
    }

    public static void main(String[] args) {
        JoinRun j1 = new JoinRun(1,50);
        JoinRun j2 = new JoinRun(51,100);

        j1.start();
        j2.start();

        try {
            j1.join();
            j2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        int resultTotal = j1.total + j2.total;
        System.out.println("j1.total + j2.total = "+resultTotal);
    }
}
