**Match code blocks with results**

Here is some code in Java but a bit of it is missing.
You should match the possible code blocks with corresponding results.
Not all results must be used, some of them might be used several times.

    class Mix5 {
        public static void main(String[] args) {
            int x = 0;
            int y = 30;
            for (int outer = 0; outer < 3; outer++) {
                for (int inner = 4; inner > 1; inner--) {
                    // [missing code block]
                    y = y - 2;
                    if (x == 6) {
                        break;
                    }
                    x = x + 3;
                }
                y = y - 2;
            }
            System.out.println(x + " " + y);
        }
    }

**Possible code blocks:**

    x = x + 3;
<!-- -->
    x = x + 6;
<!-- -->
    x = x + 2;
<!-- -->
    x++;
<!-- -->
    x--;
<!-- -->
    x = x + 0;

**Possible outputs:**

    45 6 
<!-- -->
    36 6
<!-- -->
    54 6
<!-- -->
    60 10
<!-- -->
    18 6
<!-- -->
    6 14
<!-- -->
    12 14