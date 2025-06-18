/*

write  a code to take full plurchase amount and calculate discournt obtained on it conside you went to shopping to zudio and it provides discournt upto 70% 
the slab for discount on purchase amout is given below. your final task is to calculate discount and final price after discount to be paid

*/


public class Discount{
    public static void main(String args[])
    {

        double MyShopping=8000.0;
        double discount=0.0;
        if(MyShopping<=1000)
        {
            discount=10;

        }
        else if(MyShopping<=3000)
        {
            discount=25;

        }
        else if(MyShopping<=5000)
        {
            discount=40;

        }
        else if(MyShopping<=7000)
        {
            discount=50;

        }
        else if(MyShopping<=10000)
        {
            discount=60;

        }
        else 
        {
            discount=70;

        }
        double discountCal=MyShopping*discount/100;
        System.out.println("***********************************************************************************");
        System.out.println("Shopping Amount : "+MyShopping);
        System.out.println("\n***********************************************************************************");
        System.out.println("Discount : "+discount+" % Means " +discountCal+" off \nTotal Amount :"+(MyShopping-discountCal));
        System.out.println("\n***********************************************************************************");

    }
}