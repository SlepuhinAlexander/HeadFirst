package headfirst.chapter5.listings.l1;

public class GameHelper {
    public String getUserInput(String message) {
        System.out.print(message + " ");
        return String.valueOf((int)(Math.random() * 5));
    }
}
