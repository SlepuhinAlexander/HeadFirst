package headfirst.chapter1.listings.l4;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before starting a cycle");
        while (x < 4) {
            System.out.println("Inside a cycle");
            System.out.println("x equals to " + x);
            x = x + 1;
        }
        System.out.println("After the finish of the cycle");
    }
}
