package headfirst.chapter2.listings.l3;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        while (true) {
            System.out.println("The number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("The first player thinks the number is " + guessP1);
            guessP2 = p2.number;
            System.out.println("The second player thinks the number is " + guessP2);
            guessP3 = p3.number;
            System.out.println("The third player thinks the number is " + guessP3);

            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("The first player won? " + p1IsRight);
                System.out.println("The second player won? " + p2IsRight);
                System.out.println("The third player won? " + p3IsRight);
                System.out.println("The end.");
                break;
            } else {
                System.out.println("Players should try again.");
            }
        }
    }
}
