package object_oriented_programming.polymorphism.overloading;

public class No2SalaryCalculator {
    public static double calculateSalary(double basic)
    {
        return basic;
    }
    public static double calculateSalary(double basic,double bonus)
    {
        return basic+bonus;
    }
    public static double calculateSalary(double basic,double bonus , double allowance)
    {
        return basic+bonus+allowance;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalary(100000));
        System.out.println(calculateSalary(100000,5000));
        System.out.println(calculateSalary(100000,5000,20000));
    }
}
