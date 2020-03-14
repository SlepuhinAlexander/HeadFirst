package headfirst.chapter01.listings.l01;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15) {
            myDog.bark();
        }
        while (x > 3) {
            myDog.play();
        }

        int[] numList = {2, 4, 6, 8};
        System.out.println("Hello");
        System.out.println("Dog: " + name);

        String num = "8";
        int z = Integer.parseInt(num);

        try {
            readTheFile("myFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    private void readTheFile(String path) throws FileNotFoundException {
        if (path == null) {
            throw new FileNotFoundException();
        }
    }

    private static class Dog {
        private String name;
        private int size;

        public String getName() {
            return name;
        }

        public int getSize() {
            return size;
        }

        public Dog(String name, int size) {
            this.name = name;
            this.size = size;
        }

        void bark() {
            System.out.println("woof");
        }

        void play() {

        }
    }

}