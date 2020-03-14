package headfirst.chapter04.listings.l01;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
/*
* output:
* %java DogTestDrive
* Bark! Bark!
* Yip! Yip!
* Woof! Woof!
* */
