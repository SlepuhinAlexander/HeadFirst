package headfirst.chapter2.listings.l3;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        while (true) {
            System.out.println("The number to guess is " + targetNumber);

            p1.guess();
            System.out.println("The first player thinks the number is " + p1.number);
            if (p1.number == targetNumber) {
                System.out.println("We have a winner!");
                System.out.println("The first player wins.");
                break;
            }
            p2.guess();
            System.out.println("The second player thinks the number is " + p2.number);
            if (p2.number == targetNumber) {
                System.out.println("We have a winner!");
                System.out.println("The second player wins.");
                break;
            }
            p3.guess();
            System.out.println("The third player thinks the number is " + p3.number);
            if (p3.number == targetNumber) {
                System.out.println("We have a winner!");
                System.out.println("The third player wins.");
                break;
            }
            System.out.println("Players should try again.");
        }
    }
}
