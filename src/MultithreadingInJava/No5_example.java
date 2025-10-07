package MultithreadingInJava;

public class No5_example {

    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("playing Game");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

    }
}
