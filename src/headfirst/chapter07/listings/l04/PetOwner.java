package headfirst.chapter07.listings.l04;

import headfirst.chapter07.listings.l02.Dog;
import headfirst.chapter07.listings.l02.Hippo;

public class PetOwner {
    public static void main(String[] args) {
        new PetOwner().start();
    }

    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}
