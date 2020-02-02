package headfirst.chapter1.listings.l7;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"round-the-clock", "three link", "30,000 feet", "mutual", "win-win", "frontend",
                "web-based", "penetrating", "clever", "six sigma", "critical path", "dynamical"};
        String[] wordListTwo = {"authorized", "difficult", "pure", "oriented", "central", "distributed", "clustered",
                "branded", "non-standard", "positioned", "network", "focused", "profitable", "balanced", "aimed at",
                "common", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "discharge point", "way out", "structure type", "talent", "approach",
                "level of attention gained", "portal", "time period", "overview", "sample", "destination"};

        Random r = new Random();
        System.out.println("All we need is " + (wordListOne[r.nextInt(wordListOne.length)] + " " +
                wordListTwo[r.nextInt(wordListTwo.length)] + " " +
                wordListThree[r.nextInt(wordListThree.length)]) + ".");
    }
}
