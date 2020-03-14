package headfirst.chapter10.exercises.e04;

import static java.lang.System.out;
import java.util.*;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40); // better to use Calendar.JANUARY in the second arg
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Full moon on %tc",c));
        }
    }
}
