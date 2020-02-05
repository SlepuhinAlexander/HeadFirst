package headfirst.chapter11.exercises.e4;

class MyEx extends Exception {
}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        try {
            System.out.print("t");  // this line could be before `try` block
                                    // or even at the very beginning of `doRisky` method with the same result
            doRisky(test);
            System.out.print("o");  // this line could be at the very end of `doRisky` method with the same result
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.print("s");      // this line could be at the end in `finally` block with the same result
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}
