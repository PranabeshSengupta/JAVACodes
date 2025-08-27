package test;

public class Test {
    public static void main(String[] args) {
        Cat a= new Cat();
        a.name="bob";             //In this case the object point the same address
        System.out.println(a);
        Cat a1 = makeCatNameUpperCase(a);
        System.out.println(a.name);
        System.out.println(a1.name);


        System.out.println(sum(1,2,3,5));// passing multiple element in array
        System.out.println(sum(1,2,3));

    }


 public  static Cat makeCatNameUpperCase(Cat cat){
        cat.name=cat.name.toUpperCase();
        return cat;

    }
     public  static int sum(int... a){
        int res=0;
        for (int i:a){
            res+=i;
        }
        return  res;
     }




}
