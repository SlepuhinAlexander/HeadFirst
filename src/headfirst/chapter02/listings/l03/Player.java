package headfirst.chapter02.listings.l03;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
