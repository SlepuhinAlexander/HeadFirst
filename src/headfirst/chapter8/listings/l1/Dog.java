package headfirst.chapter8.listings.l1;

public abstract class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
