/*

Static keyword is used to memory management and it associates with variable,method's,static block , nested classes
it is more of class then object

static block executed before main method because whenever class loader gets static block while compiling at that time it executes static block
 so in case of main method we need to call it.
 */


package object_oriented_programming.static_keyword;

public class No1Movie {
    int id;
    String name;
    String leadCast;
    static String hall="PVR";
    static String address;
    static {
        System.out.println("this is static block");
        hall="INOX";
        address="Pune";
        info();
    }
    static void info()
    {
        System.out.println("static method");
    }
    public No1Movie(int id,String name,String leadCast)
    {
        this.id=id;
        this.name=name;
        this.leadCast=leadCast;
    }

    public void display()
    {
        System.out.println(id+" name"+" "+leadCast);
    }
    public static void display(No1Movie m)
    {
        System.out.println(m.id+" name"+" "+m.leadCast);
    }
   public static void main(String[] args)
    {
        No1Movie m1=new No1Movie(101,"krish 3","Hrithik");
        No1Movie m2=new No1Movie(102,"chhava","vicky koshal");
        No1Movie m3=new No1Movie(103,"singham","ajay devgan");
        No1Movie m4=new No1Movie(104,"tere naam","salman");
        No1Movie m5=new No1Movie(105,"fighter","sharukh");
        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        //static display pass object
        System.out.println("********************************************");
        display(m1);
        display(m2);
        display(m3);
        System.out.println(hall);
    }
}
