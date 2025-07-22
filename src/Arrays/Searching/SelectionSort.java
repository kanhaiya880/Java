package Arrays.Searching;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={23,56,7,15,12};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
