package headfirst.chapter08.listings.l03;

import headfirst.chapter08.listings.l01.*;

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
