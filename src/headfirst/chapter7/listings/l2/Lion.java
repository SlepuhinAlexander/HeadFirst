package headfirst.chapter7.listings.l2;

public class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion roars");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
