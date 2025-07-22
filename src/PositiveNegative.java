public class PositiveNegative {
    public static void main(String args[]) {
        int number = -5;
        String result = (number > 0) ? "Positive number" : (number < 0) ? "Negative number" : "Zero";
        System.out.println(result);
    }
}