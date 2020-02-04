package headfirst.chapter7.listings.l2;

public class Cat extends Feline {
    @Override
    void makeNoise() {
        System.out.println("Cat purrs");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
