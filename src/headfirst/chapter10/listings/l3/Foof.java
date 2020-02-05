package headfirst.chapter10.listings.l3;

public class Foof {
    final int size = 3;
    final int whuffie;

    public Foof() {
        whuffie = 42;
    }

    void doStuff(final int x) {
//        x++; // cannot assign a value to final variable
    }

    void doMore() {
        final int x = 7;
//        x++; // cannot assign a value to final variable
    }
}