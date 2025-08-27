package example.inheritances;

public class Test {
    public static void main(String[] args) {
        Child child=new Child();//Constructor chaining (Grandparent--->Parent---->Child)
        //System.out.println(child.getAge());
        child.money();

    }
}

//JAVA do not support multiple inheritance ,but we can achived it by Interfaces
