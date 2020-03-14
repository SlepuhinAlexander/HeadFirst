package headfirst.chapter08.listings.l03;

import headfirst.chapter08.listings.l01.Animal;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];

    public boolean add(Animal a) {
        int index = findFreeIndex();
        if (index >= 0) {
            animals[index] = a;
            System.out.println("Animal added to cell " + index);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = null;
            return true;
        } else {
            return false;
        }
    }

    private int findFreeIndex() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
