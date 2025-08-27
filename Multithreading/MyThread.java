//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);

        }
        catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());

    }
}