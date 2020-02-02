package headfirst.chapter4.listings.l4;

public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}

/*
* output:
* %java PoorDogTestDrive
* Dog size is 0
* Dog name is null
* */