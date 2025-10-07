package CollectionFramework.linkedlistprogram;
import java.util.LinkedList;
public class LinkedListProgram {
    public static void main(String[] args) {
 LinkedList<String> places=new LinkedList<String>();
            places.add("kashmir");
            places.add("Turkey");
            places.add("udaipur");
            places.add("bali");
            places.add("ladakh");

            System.out.println(places);
            places.offer("kathmandu");
            places.offer("Paro");
            places.offer(null);
            places.offer("Italy");
            places.offerFirst("spain");
            places.offerLast("Romania");
            System.out.print(places);


    }
}
