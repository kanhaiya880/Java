package StringInJava;

import java.util.Scanner;

public class No5_BasicProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full Name");
        String[] name=sc.nextLine().split(" ");
        if (name.length==3)
        {
            String first_letter= String.valueOf(name[0].charAt(0)).toUpperCase();
            String last_letter=String.valueOf(name[1].charAt(0)).toUpperCase();
            System.out.println(first_letter+"."+last_letter+". "+name[2].toUpperCase());

        }
        else
        {
            System.out.println("please enter three world.......!!");
        }


    }
}
