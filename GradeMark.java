public class GradeMark{

    public static void main(String args[])
    {
        int percentage= 100;
        if(percentage>=0 && percentage<=100)
        {
                if(percentage>89)
                {
                    System.out.println("ATTi uttam");

                }
                else if(percentage>75 && percentage<=89)
                {
                    System.out.println("Achha kiya he, thori mehenta or lagegi");
                }
                else if(percentage>65 && percentage<=75)
                {
                    System.out.println("Mehenat jeyada karni hogi");
                }
                else if(percentage>50 && percentage<=65)
                {
                    System.out.println("itane kam marks, aa re aare ");
                }
                else 
                {
                    System.out.println("Better luck next time........");
                }
        }
        else{
            System.out.println("Invalid input..................");
        }


    }

}