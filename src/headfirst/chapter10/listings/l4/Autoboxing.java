package headfirst.chapter10.listings.l4;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        new Autoboxing().doNumsNewWay();
    }

    private void doNumsNewWay() {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        int num = listOfNumbers.get(0);
    }
}
