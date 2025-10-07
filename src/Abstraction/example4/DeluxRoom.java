package Abstraction.example4;

public class DeluxRoom extends Room{
    @Override
    void bookRoom() {
        System.out.println("Booked Delux Room.");
    }

    @Override
    public void getPricePerNight() {
        System.out.println("1500 rupees");
    }

    public DeluxRoom()
    {
        super();
    }
    public static void main(String[] args) {
        Room dr= new DeluxRoom();
        dr.bookRoom();
        dr.getPricePerNight();
    }
}
