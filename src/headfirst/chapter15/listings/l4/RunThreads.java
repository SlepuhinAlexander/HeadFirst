package headfirst.chapter15.listings.l4;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        alpha.setName("alpha thread");
        alpha.start();
        Thread beta = new Thread(runner);
        beta.setName("beta thread");
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Now running " + Thread.currentThread().getName());
        }
    }
}
