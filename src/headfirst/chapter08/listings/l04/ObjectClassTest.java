package headfirst.chapter08.listings.l04;

import headfirst.chapter08.listings.l01.Cat;
import headfirst.chapter08.listings.l01.Dog;

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
        System.out.println(a.equals(c));
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
        System.out.println(c);              // println(c) is the same as println(c.toString());
    }
}
