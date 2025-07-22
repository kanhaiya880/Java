package Arrays.Searching;

import java.util.Scanner;

// Linear Search Performing on array
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={99,75,19,11,22,55,30,86,68,49};
        System.out.println("ARRAY:{99,75,19,11,22,55,30,86,68,49}");
        System.out.print("Enter Search Number:");
        Scanner sc=new Scanner(System.in);int search_number=sc.nextInt();
        boolean result=false;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==search_number)
            {
                result=true;
                System.out.println(search_number+" Number Found at index "+i);
                break;
            }

        }
        if (!result)
        {
         System.out.println("Number Not found");
        }

    }
}
