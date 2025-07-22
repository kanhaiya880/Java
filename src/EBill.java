public class EBill{
public static void main(String args[])
{
    double units=110.0;
    double Bill=0;
    if(0<units && units<=100)
    {
        Bill=150;
    }
    else if (100<units && units<=300)
    {
        Bill=((0.5)*(units-100))+200;
    }
    System.out.print("Bill is : "+Bill);
}
} 