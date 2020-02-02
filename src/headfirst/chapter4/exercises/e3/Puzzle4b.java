package headfirst.chapter4.exercises.e3;

public class Puzzle4b {
    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}
