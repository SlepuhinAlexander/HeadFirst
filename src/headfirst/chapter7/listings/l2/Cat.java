package headfirst.chapter7.listings.l2;

public class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Cat purrs");
    }

    @Override
    void eat() {
        System.out.println("Cat eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
