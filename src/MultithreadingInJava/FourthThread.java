package MultithreadingInJava;

public class FourthThread {
    public static void main(String[] args)
    {
        Thread t1 =new Thread("Samba");
        t1.setName("Gabbar");
        System.out.println(t1.getName());

    }
}
