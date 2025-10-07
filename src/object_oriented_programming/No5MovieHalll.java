/*
create a class MovieHall and have method named booking(int totalticket,int requiredticket),
pass these two booking method from main method taking as an input and return total number of tickets left in hall
if the requireticket in morthan totalticket return -1
 */



package object_oriented_programming;

public class No5MovieHalll {
    public int booking(int totalticket,int required)
    {
        return (totalticket>required)? totalticket-required:-1;
    }
    public static void main(String[] args) {
        No5MovieHalll mh=new No5MovieHalll();
        System.out.println(mh.booking(100,33));
        System.out.println(mh.booking(100,300));
    }

}
