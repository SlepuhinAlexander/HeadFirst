package headfirst.chapter7.listings.l2;

public class Hippo extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Hippo growls");
    }

    @Override
    void eat() {
        System.out.println("Hippo eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
