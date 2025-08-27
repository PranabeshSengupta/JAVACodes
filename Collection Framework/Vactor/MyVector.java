package Vactor;

import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);


    }
}
