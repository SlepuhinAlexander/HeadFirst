package headfirst.chapter8.listings.l4;

import headfirst.chapter8.listings.l1.Cat;
import headfirst.chapter8.listings.l1.Dog;

public class ObjectClassTest {
    public static void main(String[] args) {
        ObjectClassTest test = new ObjectClassTest();
        test.equalsMethodTest();
        test.getClassMethodTest();
        test.hashCodeMethodTest();
        test.toStringMethodTest();
    }

    public void equalsMethodTest() {
        Dog a = new Dog();
        Cat c = new Cat();
        if (a.equals(c)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    public void getClassMethodTest() {
        Cat c = new Cat();
        System.out.println(c.getClass());
    }

    public void hashCodeMethodTest() {
        Cat c = new Cat();
        System.out.println(c.hashCode());
    }

    public void toStringMethodTest() {
        Cat c = new Cat();
        System.out.println(c.toString());
    }
}
