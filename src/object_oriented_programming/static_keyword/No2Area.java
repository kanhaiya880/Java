/*
write a code to create a class as area and create 3 static method in it with different parameter
circle(double radius),square(int side),rectangle(int length, int breath) and
calculate the area of all and print it.

 */
package object_oriented_programming.static_keyword;

public class No2Area {
    final static float pi=3.14f;
    static double circle(double radius)
    {
        return Math.round(pi*Math.pow(radius,2)*100.0)/100.0;
    }
    static double square(int side)
    {
        return side*side;
    }
    static double rectangle(int length, int breath)
    {
        return length*breath;
    }

    public static void main(String[] args) {
        System.out.println(circle(5));
        System.out.println(rectangle(10,20));
        System.out.println(square(3));
    }
}
