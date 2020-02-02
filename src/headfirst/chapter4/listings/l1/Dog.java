package headfirst.chapter4.listings.l1;

public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Bark! Bark!");
        } else if (size > 14) {
            System.out.println("Woof! Woof!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
