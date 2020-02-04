package headfirst.chapter8.listings.l2;

import headfirst.chapter8.listings.l1.Dog;

public class MyDogList {
    public static void main(String[] args) {
        MyDogList list = new MyDogList();
        Dog a = new Dog();
        Dog b = new Dog();
        list.add(a);
        list.add(b);
    }

    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added to cell " + nextIndex);
            nextIndex++;
        }
    }
}
