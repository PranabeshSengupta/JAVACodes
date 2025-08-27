package example.classes.annonymous;

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart(150);
        //CreditCard creditCard=new CreditCard("123456");
        //shoppingCart.processPayment(creditCard);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid Rs "+amount+" using credit card");//anonymous class is basically used to create object on the fly
            }
        });
    }
}
