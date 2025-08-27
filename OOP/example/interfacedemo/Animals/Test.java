package example.interfacedemo.Animals;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.eat();
        dog.run();//it's call default method for Animal interfaces
        dog.sleep();
        System.out.println(Animal.max_age);
        System.out.println(Dog.max_age);
        Animal.info();
        cat.run();
        cat.eat();
        cat.sleep();
    }
}
