package headfirst.chapter06.exercises.e01;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAll(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printAll(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAll(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printAll(a);
    }

    private static void printAll(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
