package headfirst.chapter4.listings.l3;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("First dog: " + one.getSize());
        System.out.println("Second dog: " + two.getSize());
        one.bark();
        two.bark();
    }
}

/*
* output
* %java GoodDogTestDrive
* First dog: 70
* Second dog: 8
* Bark! Bark!
* Yip! Yip!
* */
