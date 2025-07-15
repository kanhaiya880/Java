public class Calculator{

    public static void main(String args[])
    {

        int a=53,b=26;
        System.out.println("Choice :\n 1.addition \n 2.substraction \n 3.multiplication \n 4.division");

        int control =4;
        System.out.println("*************************************************************************************************");
        switch(control)
        {
            case 17:
                System.out.println("addition : "+(a+b));
                break;

            case 2:
                System.out.println("substraction : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication : "+(a*b));
                break;
            case 4:
                System.out.println("division : "+(a/b));
                break;
            default:
                System.out.println("Invalid choice.");
                
           
        }
    }
}