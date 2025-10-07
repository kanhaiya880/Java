package GenericsInJava;

public class Dusshera {

    public <T> void display(T value)
    {
        System.out.println(value);

    }

    public static void main(String[] args)
    {
        Dusshera dus = new Dusshera();
        dus.<String>display("Jai mata di!");
        dus.<Integer>display(1001);
        dus.<Double>display(100.5);
        dus.display("hello");

    }
}
