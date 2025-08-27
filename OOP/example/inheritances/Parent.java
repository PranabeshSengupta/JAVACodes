package example.inheritances;

public class Parent extends Grandparent {
    Parent(){
        //super();  It is called by default
        System.out.println("Calling from Parent Class.... ");
    }
    public void money(){
        super.land(); // Basically super keyword is to define the immediate parent
        System.out.println("Getting money from  parent");
    }
}
