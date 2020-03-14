package headfirst.chapter07.listings.l02;

public class Tiger extends Feline {
    @Override
    public void makeNoise() {
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
