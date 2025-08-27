package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        stack.peek();
        System.out.println(stack);
        boolean empty = stack.isEmpty();
        System.out.println(empty);
        int size = stack.size();
        System.out.println(size);
        int search = stack.search(2);
        System.out.println(search);


        //LinkedList as Stack ?
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.getLast();//peek
        linkedList.removeLast();//pop
        linkedList.size();
        linkedList.isEmpty();




        //ArrayList as Stack ?
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.get(arrayList.size()-1);//peek
        arrayList.remove(arrayList.size()-1);//pop
    }
}
