package example.encap;

public class BankAccount {
    private double balance;
    private long accNo;

    public  void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("Your deposit amount is : "+amount+"and new balance is :"+balance);

            }
            else {
                System.out.println("Deposit unsuccessful");
            }
    }


    public  void withdraw(double amount){
            if(amount>0 && amount<balance){
                balance-=amount;
                System.out.println("Your withdraw amount is : "+amount+"and new balance is :"+balance);
            }
            else {
                System.out.println("Withdraw unsuccessful due to insufficient balance");
            }
    }
    public double getBalance() {
        return balance;
    }



    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
}
