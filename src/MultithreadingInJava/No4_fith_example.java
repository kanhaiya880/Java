package MultithreadingInJava;

public class No4_fith_example implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        Runnable r1 = new No4_fith_example();
        Thread t1 = new Thread(r1,"Mongabo");
        Thread t2 = new Thread(r1,"Kanchachina");
        Thread t3 = new Thread(r1,"Shakal");
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
    }
}
