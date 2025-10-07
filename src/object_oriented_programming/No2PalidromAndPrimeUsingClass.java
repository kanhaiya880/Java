package object_oriented_programming;

public class No2PalidromAndPrimeUsingClass {
    public void primeNumber(int n)
    {
        boolean flag=true;
        if (n==1 || n==0)
        {
            System.out.println("don't enter 0 and 1");
            return;
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if (n%i==0)
                {
                    flag=false;
                    break;
                }
            }
        }

        if (flag)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }

    public void palindromeNumber(int n)
    {
        String str_n=String.valueOf(n);
        StringBuffer sb_n=new StringBuffer(str_n).reverse();
        if (str_n.equalsIgnoreCase(sb_n.toString()))
        {
            System.out.println("it's palindrome");
        }
        else
        {
            System.out.println("it's not palindrome");
        }


    }

    public static void main(String[] args) {
        No2PalidromAndPrimeUsingClass obj=new No2PalidromAndPrimeUsingClass();
        obj.primeNumber(1);
        obj.palindromeNumber(242);
    }
}
