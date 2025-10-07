package CollectionFramework.linkedlistprogram;
import java.util.*;
public class LinkedListExample2 {
    public static void main(String[] args)
    {
        LinkedList<String> players=new LinkedList<String>();
        players.add("c.ronalod");
        players.add("l.messi");
        players.add("v.anand");
        players.add("p v sindu");
        players.add("S. mandan");

        System.out.println(players.element()); //returns
        System.out.println(players.peek()); // returns
        System.out.println(players.peekLast()); // returns
        System.out.println(players.peekFirst()); // returns
        System.out.println(players.poll()); // return and delete data
        System.out.println(players);
        System.out.println(players.pollLast()); // returns and delete last data
        System.out.println(players.pop()); // returns and delete
        players.push("james gosling");
        System.out.println(players);

    }
}
