package Abstraction.example3;

public abstract class Sports {
    public abstract void bestPlayer(String name, int age);
    public abstract void bestOrganisation(String name);
 

    public void display()
    {
        System.out.println("THIS IS A CONCRETE METHOD IN ABSTRACT CLASS");
    }
}
