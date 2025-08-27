package example.inheritances;

import java.util.SortedMap;

public class Grandparent {
    private  String name;
    private int age;
    Grandparent(){
        System.out.println("Calling from Grandparent Class.... ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void land(){
        System.out.println("Getting land from grand parent");
    }
}
