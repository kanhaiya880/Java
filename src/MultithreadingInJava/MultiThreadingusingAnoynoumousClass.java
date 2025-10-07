package MultithreadingInJava;

public class MultiThreadingusingAnoynoumousClass {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            public void run(){
                System.out.println("message 1");
            }
        };
        Thread t1 = new Thread(r1);

        t1.run();
    }
}
