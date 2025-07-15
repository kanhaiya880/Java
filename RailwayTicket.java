public class RailwayTicket
{
    public static void main(String args[])
    {
        int age=15;
        double distance=300;
            if(0<distance && distance<=500)
            {
                if(0<age && age<=17)
                {  
                    System.out.println("ticket is 150");
                }
                else if(18<=age && age<=59)
                {
                    System.out.println("ticket is 500");
                }
                else if (age>=60)
                {
                    System.out.println("ticket is 250");
                }

       
            }
             else if(501<=distance && distance<=3000)
            {
                if(0<age && age<=17)
                {  
                    System.out.println("ticket is 1000");
                }
                else if(18<=age && age<=59)
                {
                    System.out.println("ticket is 4500");
                }
                else if (age>=60)
                {
                    System.out.println("ticket is 1750");
                }

       
            }
            else if(501<=distance && distance<=3000)
            {
                if(0<age && age<=17)
                {  
                    System.out.println("ticket is 1000");
                }
                else if(18<=age && age<=59)
                {
                    System.out.println("ticket is 4500");
                }
                else if (age>=60)
                {
                    System.out.println("ticket is 1750");
                }

       
            }
            else if(distance>3000)
            {
                if(0<age && age<=17)
                {  
                    System.out.println("ticket is 2500");
                }
                else if(18<=age && age<=59)
                {
                    System.out.println("ticket is 7500");
                }
                else if (age>=60)
                {
                    System.out.println("ticket is 4500");
                }

       
            }




    }
}