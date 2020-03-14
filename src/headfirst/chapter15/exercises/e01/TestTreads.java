package headfirst.chapter15.exercises.e01;

public class TestTreads {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        Thread one = new Thread(t1);
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }
}

class Accumulator {
    private static Accumulator a = new Accumulator();
    private int counter = 0;

    private Accumulator() {
    }

    public static Accumulator getAccumulator() {
        return a;
    }

    public synchronized void updateCounter(int add) {
        counter += add;
    }

    public int getCount() {
        return counter;
    }
}

class ThreadOne implements Runnable {
    Accumulator a = Accumulator.getAccumulator();

    public void run() {
        for (int x = 0; x < 98; x++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("one " + a.getCount());
    }
}

class ThreadTwo implements Runnable {
    Accumulator a = Accumulator.getAccumulator();

    public void run() {
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("two " +  a.getCount());
    }
}