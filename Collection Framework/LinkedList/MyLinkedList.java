package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.get(2));
        linkedList.addFirst(0);
        linkedList.addLast(5);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);


        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat","Dog","Cow","Tiger","lion"));
        LinkedList<String> pet=new LinkedList<>(Arrays.asList("Cat","Dog","Cow"));
        animals.removeAll(pet);

        System.out.println(animals);

    }
}
