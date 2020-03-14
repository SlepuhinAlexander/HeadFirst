package headfirst.chapter08.listings.l02;

import headfirst.chapter08.listings.l01.Dog;

public class MyDogList {
    public static void main(String[] args) {
        MyDogList list = new MyDogList();
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Dog());
        list.remove(1);
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Dog());
    }

    private Dog[] dogs = new Dog[5];

    public boolean add(Dog d) {
        int nextIndex = findFreeIndex();
        if (nextIndex >= 0) {
            dogs[nextIndex] = d;
            System.out.println("Dog added to cell " + nextIndex);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < dogs.length) {
            dogs[index] = null;
            return true;
        } else {
            return false;
        }
    }

    private int findFreeIndex() {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
