package headfirst.chapter7.listings.l2;

public class Lion extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Lion roars");
    }

    @Override
    void eat() {
        System.out.println("Lion eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
