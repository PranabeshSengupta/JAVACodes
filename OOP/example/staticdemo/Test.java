package example.staticdemo;

import static java.lang.System.*;

public class Test {

    public static void main(String[] args) {
        Utils ut1=new Utils();
        Utils ut2=new Utils();
        Utils ut3=new Utils();
        Utils ut4=new Utils();
        Utils ut5=new Utils();
        out.println(Utils.count);
        out.println(Utils.max(8,9));
        out.println(Utils.textFormat("rajA SENgupta"));
    }
}
