package WrapperClasses.misExample;

public class WrapExample {

    public static void main(String[] args)
    {
        int a=123;
        System.out.println(a);
        Integer b=a ; //auto-boxing
        System.out.println(b);

        Integer q = 456;
        int r=q; //auto-unboxing
        System.out.println(r);

        //tricky
        Integer a1 = 127;
        System.out.println(a==a1);   //// upto byte data type 127 range it will show you true other wise false

        int b1=22222;
        Integer b2=22222;
        System.out.println(b1==b2);







    }

}
