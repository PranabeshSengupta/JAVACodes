package example.inheritances;

public class Child extends  Parent{

    Child(){
        super.money();
        System.out.println("Calling from Child Class.... ");
    }
    @Override
    public void money(){
        System.out.println("Earning money own...");
    }
}
