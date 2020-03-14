package headfirst.chapter08.listings.l01;

public class Dog extends Canine implements Pet{
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

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog likes to play");
        makeNoise();
    }
}
