package headfirst.chapter07.listings.l02;

public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf woofs");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eats");
        if (hunger > 0) {
            hunger--;
        }
    }
}
