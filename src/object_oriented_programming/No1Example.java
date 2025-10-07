package object_oriented_programming;

public class No1Example {
    public  void display(int age) /// parameters
    {
        if (age>=18)
        {
            System.out.println("you can drive vehicle");
        }
        else
        {
            System.out.println("you can drive vehicle");
        }
    }
    public static  void main(String args[])
    {
        No1Example obj=new No1Example();
        obj.display(14); /// argument
    }
}
