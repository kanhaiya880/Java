package MultithreadingInJava;

public class Multithreading_using_runable_interface implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
            Runnable r1 = new Multithreading_using_runable_interface();
//            Runnable r2 = new Multithreading_using_runable_interface();
//            Runnable r3 = new Multithreading_using_runable_interface);
            Thread t1 = new Thread(r1,"first thread");
            Thread t2 = new Thread(r1,"second thread");
            Thread t3 = new Thread(r1,"Third thread");


            t1.start();
            t2.start();
            t3.start();

    }
}
