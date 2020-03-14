package headfirst.chapter08.listings.l01;

public class RobotDog extends Robot implements Pet {
    @Override
    public void beFriendly() {
        System.out.println("Robot. Dog. Is. Your. Friend.");
    }

    @Override
    public void play() {
        System.out.println("Initiating play protocol");
    }
}
