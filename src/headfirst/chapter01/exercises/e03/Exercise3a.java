package headfirst.chapter01.exercises.e03;

/*It would compile but without correction it would loot infinitely*/
public class Exercise3a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("Big x");
            }
            x = x + 2; // added line
        }
    }
}
