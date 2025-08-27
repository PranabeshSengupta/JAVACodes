package ArrayList;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list=  new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------");
        for(int x:list){
            System.out.println(x);
        }
        System.out.println(list.contains(20));
        System.out.println(list.contains(200));
        list.remove(2);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);
        list.set(2,50);//replace old value with new value
        System.out.println(list);//internally it call to string method

        List<String> list1 = Arrays.asList("Saunday", "Monday");
        System.out.println(list1.getClass().getName());
        //We can not add,remove element in asList method because it is fixed,
        // basically it is used to generate array on the fly

        System.out.println(list.getClass().getName());

        String[] array={"Apple","Banana","Cherry"};
        System.out.println(array.getClass().getName());

        List<Integer> list2=new ArrayList<>();
        list2.add(18);
        list2.add(14);
        list2.add(25);

       // list2.remove(1);
        list2.remove(Integer.valueOf(1));

        System.out.println(list2);


        Object[] array1 = list2.toArray();
        System.out.println(array1[0]);

        Integer[] array2 = list2.toArray(new Integer[0]);

        Collections.sort(list2);
        System.out.println(list2);

    }
}
