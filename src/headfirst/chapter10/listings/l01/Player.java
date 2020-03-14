package headfirst.chapter10.listings.l01;

public class Player {
    static int playerCount = 0;
    private String name;

    public Player(String n) {
        name = n;
        playerCount++;
    }
}
