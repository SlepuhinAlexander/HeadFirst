package headfirst.chapter10.listings.l5;

import java.util.Locale;

public class TestFormats {
    public static void main(String[] args) {
        System.out.println(String.format("%,d", 1000000000));
        System.out.println(String.format(Locale.ENGLISH,"%,d", 1000000000));

        System.out.println(String.format("I need to fix %,.2f bugs", 476578.09876));
        System.out.println(String.format(Locale.ENGLISH,"I need to fix %,.2f bugs", 476578.09876));

        System.out.println(String.format("%d", 42));
        System.out.println(String.format(Locale.ENGLISH,"%d", 42));

        System.out.println(String.format("%.3f", 42.0000000));
        System.out.println(String.format(Locale.ENGLISH,"%.3f", 42.0000000));

        System.out.println(String.format("%x", 42));

        System.out.println(String.format("%c", 42));

        System.out.println(String.format("Level %,d of %,.2f", 20455664, 100567890.248907));
        System.out.println(String.format(Locale.ENGLISH,"Level %,d of %,.2f", 20455664, 100567890.248907));
    }
}

/*
* output
* 1 000 000 000
* 1,000,000,000
* I need to fix 476 578,10 bugs
* I need to fix 476,578.10 bugs
* 42
* 42
* 42,000
* 42.000
* 2a
* *
* Level 20 455 664 of 100 567 890,25
* Level 20,455,664 of 100,567,890.25
* */
