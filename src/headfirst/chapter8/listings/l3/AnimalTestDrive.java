package headfirst.chapter8.listings.l3;

import headfirst.chapter8.listings.l1.Cat;
import headfirst.chapter8.listings.l1.Dog;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
    }
}
