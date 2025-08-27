package example.staticdemo;

public class Utils {
    //Static keyword
    static  int count=0;
    Utils(){
        count++;
    }
    //Static method
    public static int max(int a,int b){
        if (a >b) {
            return a;
        }
        else {
            return b;
        }

    }
    public static String textFormat(String str){
        if(str.length()!=0){
            return str.trim().toUpperCase();

        }
        else {
            return "";
        }
    }
}
