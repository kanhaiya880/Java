package Abstraction;

abstract class  Animal
{
    abstract void sound(); //abstract method

    void sleep(){
        System.out.println("Sleeping..........");
    }
}
class Dog extends Animal
{

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class No1Example {

    public static void main(String[] args) {
          Dog d= new Dog();
          d.sound();
          d.sleep();
    }
}
