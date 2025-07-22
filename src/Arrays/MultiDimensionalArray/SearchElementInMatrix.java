package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class SearchElementInMatrix {

    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        boolean elementIsNotFound=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given Matrix:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter Search Element:");
        int element=sc.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (element==arr[i][j])
                {
                    System.out.println("Searching element is : "+element+" at index : ["+i+"] ["+j+"]");
                    elementIsNotFound=false;
                }
            }
            System.out.println();
        }

        if (elementIsNotFound)
        {
            System.out.println("Element Not Found !!!");
        }
    }
}
