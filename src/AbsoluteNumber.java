// if statement example 16/6/2025
public class AbsoluteNumber{
    public static void main(String args[]) {
        int number = -10;
        if (number < 0) {
            number = -1*number; // Convert to positive
        }
        System.out.println("Absolute value: " + number);
    }
}