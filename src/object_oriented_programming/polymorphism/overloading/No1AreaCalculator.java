package object_oriented_programming.polymorphism.overloading;

public class No1AreaCalculator {

    //******************************************************Area of Circle******************************
    public static float areaofCircle(int r)
    {
        return (float) (Math.PI*(Math.pow(r,2)));
    }
    public static float areaofCircle(float r)
    {

        return (float) (Math.PI*(Math.pow(r,2)));
    }
    public static double areaofCircle(double r)
    {

        return (double) (Math.PI*(Math.pow(r,2)));
    }

    public static long areaofCircle(long r)
    {

        return (long) (Math.PI*(Math.pow(r,2)));
    }
//*************************************************Area of Square****************************************
    public static double areaOfSquare(int s)
    {
        return (double) Math.pow(s,2);
    }
    public static double areaOfSquare(double s)
    {
        return (double) Math.pow(s,2);
    }
    //*****************************************************Area of Rectangle*********************************
    public static double areaOfRectangle(int l,int w)
    {
        return (double) (l*w);
    }
    public static double areaOfRectangle(double l,double w)
    {
        return (double) (l*w);
    }

    public static void main(String[] args) {

        System.out.println(areaofCircle(10));
        System.out.println(areaofCircle(10.5));
        System.out.println(areaOfSquare(10.5));
        System.out.println(areaOfSquare(10));
        System.out.println(areaOfRectangle(10,10));
        System.out.println(areaOfRectangle(10.5,10.5));


    }
}
