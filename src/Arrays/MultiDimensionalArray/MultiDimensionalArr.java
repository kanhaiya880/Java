//multi dimensional array is array of array's

package Arrays.MultiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m,n;
        System.out.println("Enter the size array MxN :");
        m=sc.nextInt();
        n=sc.nextInt();

        int[][] arr=new int[m][n];
        System.out.println("Enter the array element:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("OUTPUT:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
