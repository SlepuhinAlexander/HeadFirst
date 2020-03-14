package headfirst.chapter02.exercises.e01;

/*It would not compile since the method playDVD() t is not declared in class DVDPlayer*/
public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        // this check for ability to record a DVD should be encapsulated in the recordDVD() method itself
        if (d.canRecord) {  // comparing boolean value with true in if statement is redundant
            d.recordDVD();
        }
    }
}
