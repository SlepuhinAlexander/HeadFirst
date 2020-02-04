package headfirst.chapter7.listings.l2;

public class Tiger extends Feline {
    @Override
    void makeNoise() {
        System.out.println("Tiger meows");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
