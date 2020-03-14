package headfirst.chapter08.listings.l01;

import java.awt.*;

public abstract class Animal {
    Image picture;
    String food;
    int hunger;
    Dimension boundaries;
    Point location;

    public void makeNoise() {
        System.out.println("Animal makes a noise");
    }

    public void eat() {
        System.out.println("Animal eats");
        if (hunger > 0) {
            hunger--;
        }
    }

    void sleep() {
        System.out.println("Animal goes to sleep");
        hunger++;
    }

    public void roam() {
        System.out.println("Animal just wanders around");
        hunger++;
    }
}
