**Work as compiler**

Check if the given piece of code would compile. Correct the code if not.

    class Exercise3a {
        public static void main(String[] args) {
            int x = 1;
            while (x < 10) {
                System.out.println("Big x");
            }
            x = x + 2;
        }
    }
<!-- -->
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Small x");
            }
        }
    }
<!-- -->
    class Exercise3c {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Small x");
            }
        }
    }
