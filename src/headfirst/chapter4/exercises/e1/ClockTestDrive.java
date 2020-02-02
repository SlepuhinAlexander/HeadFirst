package headfirst.chapter4.exercises.e1;

public class ClockTestDrive {
    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("12:45");
        String now = c.getTime();
        System.out.println("The time is: " + now);
    }
}
