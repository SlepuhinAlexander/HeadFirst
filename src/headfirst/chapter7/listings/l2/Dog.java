package headfirst.chapter7.listings.l2;

public class Dog extends Canine {
    @Override
    void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
