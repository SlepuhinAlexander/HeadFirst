package headfirst.chapter08.listings.l01;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Hippo growls");
    }

    @Override
    public void eat() {
        System.out.println("Hippo eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
