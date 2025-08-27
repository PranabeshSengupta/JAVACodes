public class Test1 {
    public static void main(String[] args) {
        BankAccount boi = new BankAccount();
        Runnable task = new Runnable() {    // anonymous class Runnable interface
            @Override
            public void run() {
                boi.withdrawl(50);
            }

        };
        Thread t1 = new Thread(task, "Ram");
        Thread t2 = new Thread(task, "Raja");
        t1.start();
        t2.start();


    }
}
