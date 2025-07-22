package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class Rotate90 {

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
        System.out.println("Rotated Matrix 90 degree:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j >= 0; j--) {

                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
