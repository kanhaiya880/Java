package Exam.firstexam;

public class No2_pattern {

    public static void main(String[] args) {
        int num=5;
        for(int i=num;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=i;j==i;--j)
            {
                System.out.print(j);
                for(int k=4;k>=i;k--)
                {
                    System.out.print("   ");
                    if(k==i)
                    {
                        System.out.print(k);
                    }
                }
            }
            System.out.println();
        }

        for(int i=2;i<=num;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j==i;j--)
            {
                System.out.print(j);
                for(int k=4;k>=i;k--)
                {
                    System.out.print("   ");
                    if(k==i)
                    {
                        System.out.print(" "+k);
                    }
                }
            }
            System.out.println();
        }

    }
}
