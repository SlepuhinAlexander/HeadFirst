package headfirst.chapter16.exercises.e1;

import java.util.*;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mtn.add(new Mountain("Long Range", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("By adding order:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("By name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By height:\n" + mtn);

    }

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return two.height - one.height;
        }
    }
}

class Mountain {
    String name;
    int height;

    public Mountain(String n, int h) {
        name = n;
        height = h;
    }

    public String toString() {
        return name + " " + height;
    }
}
