package example.encap;

public class Test {
    public static void main(String[] args) {
        BankAccount acc1= new BankAccount();
        acc1.setAccNo(50230019600466l);
        acc1.deposit(-10);
        acc1.deposit(10000);
        acc1.deposit(3000);
        acc1.withdraw(800);
        acc1.withdraw(900);
        acc1.withdraw(70);
        System.out.println(acc1.getBalance());
        acc1.getAccNo();


    }
}
