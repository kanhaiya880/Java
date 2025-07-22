package Arrays.Searching;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ARRAY:");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter The Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("INPUT:");
        for(int e : arr)
        {
            System.out.print(e+"\t");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("OUTPUT:");
        for(int e : arr)
        {
            System.out.print(+e+"\t");
        }
    }
}
