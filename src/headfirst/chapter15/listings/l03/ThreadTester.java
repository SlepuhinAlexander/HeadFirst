package headfirst.chapter15.listings.l03;

public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Returning to main method");
    }
}
