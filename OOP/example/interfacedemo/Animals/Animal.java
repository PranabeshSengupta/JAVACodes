package example.interfacedemo.Animals;

public interface Animal {
    public static final int max_age=120;
    public abstract void eat();
    void sleep();
    public static void info(){
        System.out.println("This is Animal Interfaces");
    }
    //default method
    public default void run(){
        this.eat();
        System.out.println("Animal is running....");
    }
}
