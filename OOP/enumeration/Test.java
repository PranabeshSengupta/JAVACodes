package enumeration;

public class Test  {
    public static void main(String[] args) {
        Day day1 = Day.SUNDAY;
        Day day2=Day.MONDAY;
        System.out.println(day2);
        System.out.println(day1);
        System.out.println(day1.name());
        int ordinal = day2.ordinal();
        System.out.println(ordinal);
        Day[] values = Day.values();
        for (Day i : values){
            System.out.println(i);
        }
        day1.display();

    }
}
