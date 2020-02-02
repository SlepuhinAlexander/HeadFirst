package headfirst.chapter1.listings.l3;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        String name = "Dagger";
        x = x * 17;
        System.out.println("x equals " + x);
        while (x > 12) {
            x = x - 1;
        }
        x = 0;
        for (int i = 0; i < 10; i++) {
            x++;
            System.out.println("Now x equals " + x);
        }

        if (x == 10) {
            System.out.println("x must be equal to 10");
        } else {
            System.out.println("x does not equal to 10");
        }
        if ((x < 3) && (name.equals("Dagger"))) {
            System.out.println("Be careful!");
        }
        System.out.println("This line is executed in any case");
    }
}
