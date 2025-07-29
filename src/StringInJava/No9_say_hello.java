package StringInJava;

import java.util.Scanner;

public class No9_say_hello {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter state name :");
        String city_name=sc.nextLine();
        if (city_name.equals("pune"))
        {
            System.out.println("Hello pune");
        } else if (city_name.equals("parbhani")) {
            System.out.println("hello parbhani");
        }
    }
}
