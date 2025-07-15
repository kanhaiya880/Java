import java.util.Scanner;

public class BigAndSmallElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter ARRAY["+i+"]=");
            arr[i]=sc.nextInt();
        }

        int smallest=arr[0];
        int biggest=arr[0];
        System.out.println("Even elements of array:");
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
            if(arr[i]>biggest)
            {
                biggest=arr[i];
            }

        }
        System.out.println("Smallest Number:"+smallest+"\nBiggest Number:"+biggest);
    }
}
