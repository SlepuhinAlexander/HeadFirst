package headfirst.chapter07.listings.l03;

import headfirst.chapter07.listings.l02.*;

public class AnimalsTestDrive {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        animals[5] = new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].roam();
        }
    }
}
