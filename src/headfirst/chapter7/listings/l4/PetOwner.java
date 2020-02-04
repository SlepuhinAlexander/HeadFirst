package headfirst.chapter7.listings.l4;

import headfirst.chapter7.listings.l2.Dog;
import headfirst.chapter7.listings.l2.Hippo;

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
