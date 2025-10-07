package Abstraction.example4;

public abstract class Room {
    Room()
    {
        System.out.println("Abstract class constructor");
    }
    abstract void bookRoom();
    public abstract void getPricePerNight();
}
