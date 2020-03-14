package headfirst.chapter02.exercises.e01;

/*It would not compile since the variable t is not declared*/
public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck(); // added line
        t.canRecord = true;
        t.playTape();

        // this check for ability to record a tape should be encapsulated in the recordTape() method itself
        if (t.canRecord) { // comparing boolean value with true in if statement is redundant
            t.recordTape();
        }
    }
}