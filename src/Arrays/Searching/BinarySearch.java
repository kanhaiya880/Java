package Arrays.Searching;

import java.util.Scanner;

//binary search performing on array
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        System.out.print("Enter Search Number:");
        Scanner sc=new Scanner(System.in);
        int search_number=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            int mid=(low+high)/2;
            if(search_number==arr[mid])
            {
                System.out.println(search_number+" Number Found At index "+mid);
                found=true;
                break;
            } else if (arr[mid]<search_number) {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        if (!found)
        {
            System.out.println("Number Not Found");
        }
    }
}
