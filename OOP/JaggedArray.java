// A jagged array in Java is a type of multidimensional
// array where the inner arrays (or rows) can have different lengths
public class JaggedArray
{
    public static void main(String[] args)
    {
        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[2];
        arr[0][0]=5;
        arr[0][1]=8;
        arr[1][0]=50;
        arr[1][1]=15;
        arr[1][2]=55;
        arr[2][0]=35;
        arr[2][1]=75;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
