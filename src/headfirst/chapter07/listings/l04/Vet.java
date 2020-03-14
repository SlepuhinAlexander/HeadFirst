package headfirst.chapter07.listings.l04;

import headfirst.chapter07.listings.l02.*;

public class Vet {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        animals[5] = new Tiger();
        Vet vet = new Vet();
        for (Animal animal : animals) {
            vet.giveShot(animal);
        }
    }

    public void giveShot(Animal a) {
        System.out.println("Vet gives a shot to animal");
        a.makeNoise();
    }
}
