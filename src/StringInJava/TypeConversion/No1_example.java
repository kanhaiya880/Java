package StringInJava.TypeConversion;

public class No1_example {
    public static void main(String[] args) {
        String year="2002";
        int int_year=Integer.parseInt(year); //// convert to premitive type
        System.out.println(int_year);
        float float_year=Float.parseFloat(year);
        System.out.println(float_year);
        double double_year=Double.parseDouble(year);
        System.out.println(double_year);
        String double_string=Double.toString(double_year);
        System.out.println(double_string.getClass());


    }
}
