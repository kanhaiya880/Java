package Abstraction;

interface AnimalBase {
    void sound();  // all methods are abstract by default
}

class Cat implements AnimalBase {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class No2Example {


    public static void main(String[] args) {
        Cat c =new Cat();
        c.sound();
    }
}
