package headfirst.chapter1.listings.l1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        int size = 27;
        String name = "Fido";

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

}