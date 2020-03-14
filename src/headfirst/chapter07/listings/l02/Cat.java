package headfirst.chapter07.listings.l02;

public class Cat extends Feline {
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
}
