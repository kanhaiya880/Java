public class GradeSystem {
    public static void main(String args[]) {
        char c = 'F';

        char grade = Character.toUpperCase(c); // convert once and reuse

        if (grade == 'A') {
            System.out.println("Hello parents, GRADE is: " + grade);
        } else if (grade == 'B') {
            System.out.println("Hello parents, GRADE is: " + grade);
        } else if (grade == 'C') {
            System.out.println("Hello parents, GRADE is: " + grade);
        } 
        else if(grade=='F') {
            System.out.println("Hello parents, your son has failed...");
        }
        else{
            System.out.print("Invalid input.........");
        }
    }
}
