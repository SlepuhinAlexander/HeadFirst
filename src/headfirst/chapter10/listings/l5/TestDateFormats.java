package headfirst.chapter10.listings.l5;

import java.util.Date;
import java.util.Locale;

public class TestDateFormats {
    public static void main(String[] args) {
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format(Locale.ENGLISH,"%tc", new Date()));

        System.out.println(String.format("%tr", new Date()));

        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today, today, today));
        System.out.println(String.format("%tA, %<tB %<td", new Date())); // the same code
        System.out.println(String.format(Locale.ENGLISH,"%tA, %<tB %<td", new Date()));
    }
}

/*
* output
* ср февр. 05 19:27:21 MSK 2020
* Wed Feb 05 19:27:21 MSK 2020
* 07:27:21 PM
* среда, февраля 05
* среда, февраля 05
* Wednesday, February 05
* */
