package headfirst.chapter10.listings.l06;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,Calendar.JANUARY,7,15,40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;         // adding one hour (in milliseconds)
        c.setTimeInMillis(day1);
        System.out.println("New hour " + c.get(Calendar.HOUR_OF_DAY));
        c.add(Calendar.DATE,35);    // adding 35 days
        System.out.println("Add 35 days " + c.getTime());
        c.roll(Calendar.DATE,35);   // rolling 35 days
        System.out.println("Roll 35 days " + c.getTime());
        c.set(Calendar.DATE,1);   // setting date to 1
        System.out.println("Set date to 1 " + c.getTime());
    }
}
/*
* output
* New hour 16
* Add 35 days Wed Feb 11 16:40:21 MSK 2004
* Roll 35 days Tue Feb 17 16:40:21 MSK 2004
* Set date to 1 Sun Feb 01 16:40:21 MSK 2004
* */