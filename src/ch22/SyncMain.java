package ch22;
class Bank{
    private int money = 10000;

    public synchronized void saveMoney(int save){
        int currentMoney = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(currentMoney + save);
    }
    public synchronized void minusMoney(int minus){
        int currentMoney = getMoney();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(currentMoney - minus);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{
    @Override
    public void run() {
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
    }
}

class ParkWife extends Thread{
    @Override
    public void run() {
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
    }
}


public class SyncMain {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park park = new Park();
        park.start();
        Thread.sleep(200);
        ParkWife parkWife = new ParkWife();
        parkWife.start();

    }
}
