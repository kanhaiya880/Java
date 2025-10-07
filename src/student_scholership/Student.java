package student_scholership;

import java.util.Scanner;

public class Student extends Person {
    int roll;
    double marks;
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        address=sc.nextLine();
        roll=sc.nextInt();
        marks=sc.nextFloat();
    }


}
