//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        int arr[]={10,-80,9,40,6};
        int arr_max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr_max) {
                arr_max=arr[i];
            }
        }
        System.out.println("Maximum number in array is : "+ arr_max);
    }
}