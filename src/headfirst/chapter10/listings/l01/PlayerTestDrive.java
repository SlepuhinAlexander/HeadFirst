package headfirst.chapter10.listings.l01;

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}

/*
* output:
* 0
* 1
* */