package headfirst.chapter01.exercises.e03;

/*It would not compile since the code is located in class declaration (not in the method or other code block).
Moreover the absence of the main method means there is nothing to run*/
public class Exercise3c {
    public static void main(String[] args) { // added line
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Small x");
            }
        }
    } // added line
}
