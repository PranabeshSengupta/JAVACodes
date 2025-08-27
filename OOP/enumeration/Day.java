package enumeration;
//Enum is used to define  list of things
public enum Day {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY;

        public void display(){
            System.out.println("Today is "+ this.name());
        }
}
