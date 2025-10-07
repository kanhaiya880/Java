package object_oriented_programming;

public class No3Example {
    public double method1(int a, int b)
    {
        return a*b*0.5;
    }
    public static void main(String[] args) {
        No3Example obj=new No3Example();
        System.out.println(obj.method1(2,3));
    }
}
