package headfirst.chapter11.listings.l2;

public class ExceptionTest {
    boolean abandonAllHope;
    static ExceptionTest anObject = new ExceptionTest();

    public static void main(String[] args) {
        anObject.crossFingers();
    }

    public void takeRisk() throws BadException {
        if (abandonAllHope) {
            throw new BadException();
        }
    }

    public void crossFingers() {
        try {
            anObject.takeRisk();
        } catch (BadException e) {
            System.out.println("Oh no!");
            e.printStackTrace();
        }
    }
}

class BadException extends Exception {

}
