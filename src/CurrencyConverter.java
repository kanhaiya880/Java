/*
usd
euro
ad
sy
won


*/


public class CurrencyConverter{
    public static void main(String args[])
    {
        System.out.println("Choice : \n1.Ruppes to USD \n2.Rupees to EURO");
        int choice=5;
        double value=86.71;
        switch(choice){
            case 1:
                System.out.println("Ruppes :"+value+" USD :"+(value*(0.012)));
                break;
            case 2:
                System.out.println("Ruppes :"+value+" EURO :"+(value*(0.01)));
                break;
            case 3:
                System.out.println("Ruppes :"+value+" AUD :"+(value*(0.02)));
                break;
            case 4:
                System.out.println("Ruppes :"+value+" CNY :"+(value*(0.08)));
                break;
            case 5:
                System.out.println("Ruppes :"+value+" PKR:"+(value*(3.27)));
                break;


        }

    }
}