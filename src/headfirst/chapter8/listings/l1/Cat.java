package headfirst.chapter8.listings.l1;

public class Cat extends Feline implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Cat purrs");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
        if (hunger > 0) {
            hunger--;
        }
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly");
    }

    @Override
    public void play() {
        System.out.println("Cat likes to play");
        makeNoise();
    }
}
