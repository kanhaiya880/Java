import java.util.Scanner;

public class PrintEvenNumberFromArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter ARRAY["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Even elements of array:");
        for (int i=0;i<5;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("ARRAY["+i+"]="+arr[i]);
            }

        }
    }
}
