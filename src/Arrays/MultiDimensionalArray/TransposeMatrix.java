package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class TransposeMatrix {
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
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transposed=new int[3][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                transposed[j][i]=arr[i][j];

            }

        }
        /// here you can directly use arr[j][i] without using transposed array
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transposed.length; i++)
        {
            for (int j = 0; j < transposed.length; j++)
            {
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
        }



    }
}
