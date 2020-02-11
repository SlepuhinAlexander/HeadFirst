package headfirst.chapter15.listings.l5;

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        one.setName("Ryan");
        one.start();
        Thread two = new Thread(theJob);
        two.setName("Monica");
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
        }
    }

    private void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " tries to make a withdrawal");
            try {
                System.out.println(Thread.currentThread().getName() + " goes to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " wakes up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " finishes transaction");
        } else {
            System.out.println("Sorry, the client " + Thread.currentThread().getName() + " does not have enough money");
        }
    }
}
