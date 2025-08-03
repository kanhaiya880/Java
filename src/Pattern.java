public class Pattern {

    public static void main(String[] args) {

//	1. ---------------------------------------------------

        System.out.println("\n1. ________________________________________________________\n");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print("*");


            }
            System.out.println();
        }



//	2. ---------------------------------------------------
        System.out.println("\n2. ________________________________________________________\n");

        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");


            }
            System.out.println();
        }



//	3. ---------------------------------------------------
        System.out.println("\n3. ________________________________________________________\n");

        for (int i=0;i<=5;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(j*2);


            }
            System.out.println();
        }


//4. ---------------------------------------------------
        System.out.println("\n4. ________________________________________________________\n");

        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("k");
                }
                else
                {
                    System.out.print(j);

                }

            }
            System.out.println();
        }


//5. ---------------------------------------------------
        System.out.println(" 5. ________________________________________________________\n");

        for (int i=0;i<=5;i++)
        {
            for (int j=0;j<i;j++)
            {
                char a=(char)j;
                System.out.print(a);


            }
            System.out.println();
        }



//6. ---------------------------------------------------
        System.out.println("6. ________________________________________________________\n");

        for (int i=1;i<=5;i++)
        {

            for (int j=1;j<=i;j++)
            {


                if((i+j)%2==0)
                {
                    System.out.print("1");

                }
                else
                {
                    System.out.print("0");

                }


            }

            System.out.println();
        }



//7. ---------------------------------------------------
        System.out.println("7. ________________________________________________________\n");

        for (int i=5;i>=1;i--)
        {

            for (int j=5;j>=i;j--)
            {

                System.out.print(j);


            }

            System.out.println();
        }


//8. ---------------------------------------------------
        System.out.println("8. ________________________________________________________\n");

        for (int i=5;i>=1;i--)
        {

            for (int j=5;j>=i;j--)
            {
                System.out.print(i);


            }

            System.out.println();
        }

//---------------------------------------------------
        System.out.println("\n 9.________________________________________________________\n");

        for (int i=1;i<=5;i++)
        {
            for (int k=4;k>=i;k--)
            {
                System.out.print(" ");


            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");


            }
            System.out.println();
        }



        //---------------------------------------------------
        System.out.println("\n 10.________________________________________________________\n");

        for (int i=1;i<=5;i++)
        {

            for (int j=5;j>=i;j--)
            {
                System.out.print("*");


            }
            System.out.println();
        }



//---------------------------------------------------
        System.out.println("\n 11.________________________________________________________\n");
        for (int i=1;i<=5;i++)
        {

            for (int j=5;j>=i;j--)
            {
                System.out.print(i);


            }
            System.out.println();
        }





//---------------------------------------------------
        System.out.println("\n 11.________________________________________________________\n");

        for (int i=5;i>=0;i--)
        {

            for (int j=0;j<i;j++)
            {
                System.out.print(" "+j*3);


            }
            System.out.println();
        }




//---------------------------------------------------
        System.out.println("\n 12.________________________________________________________\n");

        for (int i=5;i>=0;i--)
        {	int a=97;

            for (int j=0;j<i;j++)
            {
                System.out.print(" "+(char)a);
                a++;


            }
            System.out.println();
        }

//---------------------------------------------------

        System.out.println("\n 13.________________________________________________________\n");

        for (int i=5;i>=0;i--)
        {	int a=97;
            int b=1;

            for (int j=0;j<i;j++)
            {
                if(j%2==0)
                {
                    System.out.print(" "+b);
                    b++;
                }
                else
                {
                    System.out.print(" "+(char)a);
                    a++;
                }



            }
            System.out.println();
        }






//---------------------------------------------------
        System.out.println("\n 14.__________________________pyrimade______________________________\n");

        for (int i=1;i<=5;i++)
        {
            for (int k=4;k>=i;k--)
            {
                System.out.print(" ");


            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");


            }
            System.out.println();
        }



//---------------------------------------------------
        System.out.println("\n 15.________________________________________________________\n");


        for(int i=1;i<=5;i++)
        {
            for(int k=2;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//reverse
//for(int i=5;i>=1;i--)
//{
//	for(int k=i;k<=5;k++)
//	{
//		System.out.print(" ");
//	}
//	for(int j=i;j>=1;j--)
//	{
//		System.out.print("*");
//	}
//	System.out.println();
//}



//---------------------------------------------------
        System.out.println("\n 16._________________________Sasta Dimond_______________________________\n");

        for (int i=1;i<=5;i++)
        {
            for (int k=4;k>=i;k--)
            {
                System.out.print(" ");


            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");


            }
            System.out.println();
        }
        for(int i=2;i<=5;i++)
        {
            for(int k=2;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

//---------------------------------------------------
        System.out.println("\n 17._________________________Sasta Dimond_______________________________\n");

        for(int i=1;i<=5;i++)
        { int m=1;
            for(int k=4;k>=i;k--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {	while(m<=((j*2)-1))
            {

                System.out.print(" *");
                m++;

            }

            }
            System.out.println();

        }



//---------------------------------------------------
        System.out.println("\n 18._________________________Sasta Dimond_______________________________\n");


        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            // Print spaces
            for (int j = 4; j >=i; j--) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }








//---------------------------------------------------
        System.out.println("\n 19._________________________Sasta Dimond_______________________________\n");



        for (int i = 5; i >= 1; i--) {
            // Print spaces
            for (int j = 4; j >=i; j--) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }




//---------------------------------------------------
        System.out.println("\n 18._________________________Sasta Dimond_______________________________\n");


        int m=1;
        for (int i = 1; i <= rows; i++) {
            // Print spaces


            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print(" "+m);

            }
            ++m;

            // Move to the next line
            System.out.println();

        }
        m=4;
        for (int i = 4; i >= 1; i--) {
            // Print spaces
            for (int j = 4; j >=i; j--) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k < (2 * i); k++) {
                System.out.print(" "+m);
            }
            m--;

            // Move to the next line
            System.out.println();
        }



    }

}
