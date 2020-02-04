package headfirst.chapter7.listings.l2;

public class Wolf extends Canine {
    @Override
    void makeNoise() {
        System.out.println("Wolf woofs");
    }

    @Override
    void eat() {
        System.out.println("Wolf eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
