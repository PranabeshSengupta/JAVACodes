import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private  int balance=200;
    private final Lock lock= new ReentrantLock();// we can create our own lock
    public   void  withdrawl(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdraw............");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();

                    }
                    finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdraw,Remaining balance : " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock,try again later !!");
            }
        }
        catch (Exception e){
            Thread.currentThread().interrupt();

        }


    }
}
