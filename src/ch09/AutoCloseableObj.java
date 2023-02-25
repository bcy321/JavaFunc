package ch09;

class AutoCloseableImp implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closing...");
    }
}

public class AutoCloseableObj{
    public static void main(String[] args) {
        try(AutoCloseableImp autoCloseableImp = new AutoCloseableImp()) {
            throw new Exception();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("run");
    }
}