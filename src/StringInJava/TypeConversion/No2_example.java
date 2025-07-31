//package StringInJava.TypeConversion;public class No2_example { public static void main(String[] args) { String year="2025"; System.out.println(Integer.parseInt(year.substring(0,2))+Integer.parseInt(year.substring(2)));}}


package StringInJava.TypeConversion;

import java.util.Scanner;

public class No2_example {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter year:");
        int num=sc.nextInt();
        int sq=num*num;
        String square=Integer.toString(sq);
        int div=square.length()/2;
        int p1=Integer.parseInt(square.substring(0,div));
        int p2=Integer.parseInt(square.substring(div));
        System.out.println(p1+p2);

        if ((p1+p2)==num)
        {
            System.out.println("kapreke number");
        }
        else{
            System.out.println("not kapreke number");
        }
    }
}


