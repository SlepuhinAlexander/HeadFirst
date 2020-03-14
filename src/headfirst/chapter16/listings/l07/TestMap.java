package headfirst.chapter16.listings.l07;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Berth", 343);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Berth"));
    }
}

/*
* output:
* {Kathy=42, Berth=343, Skyler=420}
* 343
* */
