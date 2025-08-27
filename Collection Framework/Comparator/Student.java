package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<StudentDemo> students=new ArrayList<>();
        students.add(new StudentDemo("Alice",3.5));
        students.add(new StudentDemo("Ram",3.9));
        students.add(new StudentDemo("BOB",4.5));
        students.add(new StudentDemo("Kitty",3.5));
//        //Comparator used
        students.sort((a,b)-> {
            if (b.getGpa()-a.getGpa()>0){
                return 1;
            }
            else if (b.getGpa()-a.getGpa()<0){
                return -1;
            }
            else {
                return a.getName().compareTo(b.getName());
            }
        });

//        Comparator<StudentDemo> comparing = Comparator.comparing(StudentDemo::getGpa).reversed().thenComparing(StudentDemo::getName);
//        students.sort(comparing);

        for (StudentDemo s:students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }
    }
}
