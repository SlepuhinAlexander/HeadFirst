package headfirst.chapter2.listings.l3;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I thing this number is " + number);
    }
}
