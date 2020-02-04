package headfirst.chapter8.listings.l3;

import headfirst.chapter8.listings.l1.Animal;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added to cell " + nextIndex);
            nextIndex++;
        }
    }
}
