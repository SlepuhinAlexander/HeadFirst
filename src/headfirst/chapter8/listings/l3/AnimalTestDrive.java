package headfirst.chapter8.listings.l3;

import headfirst.chapter8.listings.l1.*;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Hippo());
        list.add(new Lion());
        list.remove(1);
        list.add(new Tiger());
        list.add(new Cat());
    }
}
