package StringInJava;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();

        String Result= (s1.equals((new String(new StringBuffer(s1).reverse()))))? "palindrom":"Not palindrom";

        System.out.println(Result);
    }
}
