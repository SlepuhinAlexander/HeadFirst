package headfirst.chapter1.exercises.e3;

/*It would not compile since there is no class declared*/
public class Exercise3b {
    public static void main(String[] args) { // added line
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Small x");
            }
        }
    }
} // added line
