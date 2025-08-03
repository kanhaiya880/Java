package Exam.firstexam;
import java.util.Scanner;
public class No3_contains_substring {

    public static void main(String[] args) {

        int n=0,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of String  :");
        n=sc.nextInt();
        String[] NameAndItems=new String[n];

        for(int i=0;i<n;i++)
        {   System.out.print("Enter String value:");
            NameAndItems[i]=sc.nextLine();
            //sc.nextLine();
        }

        for(int i=2;i<n;i++)
        {
            if(NameAndItems[i].contains(NameAndItems[0]))
            {
                count++;
            }
        }

        System.out.println("discount: "+count);

    }
}
