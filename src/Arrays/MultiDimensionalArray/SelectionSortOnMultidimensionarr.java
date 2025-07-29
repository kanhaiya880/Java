package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class SelectionSortOnMultidimensionarr {
    public static void main(String[] args) {
        int m=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of MxN:");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        boolean elementIsNotFound=true;

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j <n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given Matrix:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //calculating length
        int arrLength=0;
        for (int i = 0; i < arr.length; i++) {

            arrLength+=arr[i].length;
        }

        int[] arr1=new int[arrLength];
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr1[k]=arr[i][j];
                k++;
            }

        }

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }



        for (int i = 0; i < arr1.length; i++) {
            for (int j =i+1; j < arr1.length; j++) {
                if (arr1[j]<arr1[i])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }




            k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               arr[i][j]=arr1[k];
                k++;
            }

        }

        System.out.println("\nSorted Matrix:");
        for (int i = 0; i < m;i++)
        {
            for (int j = 0; j <n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }





    }
}
