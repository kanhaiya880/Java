public class BuzzNumber
{

    public static void main(String args[])
    {
        int number=20;
        if((number%7== 0)||(number%10==7))
        {
            System.out.println("This is buzz number");
        }
        else
        {
            System.out.println("This is not buzz number");
        }
    }
}