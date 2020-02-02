package headfirst.chapter1.listings.l7;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"round-the-clock", "three link", "30,000 feet", "mutual", "win-win", "frontend",
                "web-based", "penetrating", "clever", "six sigma", "critical path", "dynamical"};
        String[] wordListTwo = {"authorized", "difficult", "pure", "oriented", "central", "distributed", "clustered",
                "branded", "non-standard", "positioned", "network", "focused", "profitable", "balanced", "aimed at",
                "common", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "discharge point", "way out", "structure type", "talent", "approach",
                "level of attention gained", "portal", "time period", "overview", "sample", "destination"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("All we need is " + phrase + ".");
    }
}
