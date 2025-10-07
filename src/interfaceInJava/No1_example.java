package interfaceInJava;


interface Animal
{
    void sound();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep()
    {
        System.out.println("Dog Sleeps");
    }

}

public class No1_example  {
    public static void main(String[] args)
    {
        Animal a = new Dog(); // interface reference, object of dog
        a.sound();
        a.sleep();

    }

}
