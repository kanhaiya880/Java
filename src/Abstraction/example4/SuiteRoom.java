package Abstraction.example4;

public class SuiteRoom extends Room{

    @Override
    void bookRoom() {
        System.out.println("Booked Suite Room.");
    }

    @Override
    public void getPricePerNight() {
        System.out.println("2000 rupees");
    }


    public static void main(String[] args) {
        Room sur= new SuiteRoom();
        sur.bookRoom();
        sur.getPricePerNight();
    }
}
