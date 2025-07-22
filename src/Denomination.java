import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        int [] denomination={500,200,100,50,20,10,5,2,1};
        System.out.println("Enter amount:");
        Scanner sc=new Scanner(System.in);
        int total=0;
        int amount=sc.nextInt();
        for (int denom : denomination)
        {   int count=amount/denom;
            if (count>0)
            {
                total+=(count*denom);
                System.out.println(denom + " x " + count+"="+(count*denom));
                amount = amount % denom;

            }

        }
        System.out.println("TOTAL AMOUNT:"+total);
    }
}
