public class BigNumber{

    public static void main(String args[])
    {
        int a=1,b=5,c=1;

        if(a>b && a>c)
        {
            System.out.println("A is big");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is big");
        }
        else if(c>a && c>b)
        {
            System.out.println("C is big");
        }
        else if(a==b || a==c  || b==c )
        {
            System.out.println("Two of them have same value");
        }
        else
        {
            System.out.println("All of them are same");
        }

    }
}