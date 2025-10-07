/*
bus,train,
 */

package object_oriented_programming;

public class No6TravelMode {
    public void bus()
    {
        System.out.println("Traveling in bus");
    }
    public void train()
    {
        System.out.println("Traveling in train");
    }
    public void flight()
    {
        System.out.println("Traveling in flight");
    }
    public void car()
    {
        System.out.println("Traveling in car");
    }

    public static void main(String[] args) {
        No6TravelMode tm=new No6TravelMode();
        String mode="Bus";
        if (mode.equalsIgnoreCase("bus"))
        {
            tm.bus();
        }
        else if(mode.equalsIgnoreCase("train"))
        {


            tm.train();
        }
        else if (mode.equalsIgnoreCase("flight"))
        {
            tm.flight();
        }
        else
        {
            System.out.println("invalid mode");
        }

    }
}
