package object_oriented_programming.polymorphism.overloading;

public class No0PolymorphismExample {
    String name="kanhaiya";
    public void display()
    {
        System.out.println("this is non parameterized method");
    }
    public void display( String s)
    {
        System.out.println("this is parameterized method String is "+s);

    }
    public void display(int a , int b , int c)
    {
        System.out.println("this is integer method: "+(a+b+c));
    }
    public void display(String[] arr)
    {
        for(String a:arr)
        {
            System.out.println(a);
        }
    }
    public void display(No0PolymorphismExample obj)
    {
        System.out.println(obj.name);
    }
    public static void main(String[] args) {
        No0PolymorphismExample obj1=new No0PolymorphismExample();
        obj1.display("hello world");
        obj1.display();
        obj1.display(1,2,3);
//        String[] arr={"Kanhaiya","Sanjay","Chaudhari"};
//        obj1.display(arr);
        obj1.display(new String[]{"kanhaiya","Sanjay","Chaudhari"}); /// array as argument
        obj1.name="sahil";
        obj1.display(obj1);             ////objecct as argument
    }
}
