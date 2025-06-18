public class Arithematic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = b - a;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Modulus
        int remainder = b % a;
        System.out.println("Remainder: " + remainder);
    }
}