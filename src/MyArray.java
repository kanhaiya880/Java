import java.util.Scanner;

public class MyArray {

    public  static void main(String[] args)
    {
//        int[] arr0;     //array declaration
//        int[] arr1=new int[5]; //declaration + memory allocation
//        int[] arr2=new int[]{1,2,3};  //Declaration + Allocation + Initialization (Dynamic Initialization)
        int[] arr=new int[5]; ///array Declaration
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter ARRAY["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("OUTPUT:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("ARRAY["+i+"]="+arr[i]);
        }




    }
}
