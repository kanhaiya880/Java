package Abstraction.example4;

public class StandardRoom extends Room{

    @Override
    void bookRoom() {
        System.out.println("Booked Standard Room.");
    }

    @Override
    public void getPricePerNight() {
        System.out.println("3000 rupees");
    }

    public static void main(String[] args) {
        Room sr= new StandardRoom();
        sr.bookRoom();
        sr.getPricePerNight();
    }
}
