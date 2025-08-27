package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
       // return s2.length()-s1.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1-o2 ; //Ascending order
        return o2-o1 ; //Descending order
    }
}
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(8);

        list.sort(new MyComparator());
        System.out.println(list);


        List<String> words= Arrays.asList("banana","apple","date");
        //words.sort(new StringLengthComparator());
        words.sort((a,b)->b.length()-a.length());//using Lambda expression
        System.out.println(words);
    }

}
