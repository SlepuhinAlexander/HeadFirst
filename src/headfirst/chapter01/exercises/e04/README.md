**Match code blocks with results**

Here is some code in Java but a bit of it is missing.
You should match the possible code blocks with corresponding results.
Not all results must be used, some of them might be used several times.

    class Test {
        public static woid main(Sting[] args) {
            int x = 0;
            int y = 0;
            while (x < 5) {
                // Put
                // a code
                // block
                // here
                System.out.print(x + "" + y + " ");
                x = x + 1;
            }
        }
    }

**Possible code blocks:**

    y = x - y;
<!-- -->
    y = y + x;
<!-- -->
    y = y + 2;
    if (y > 4) {
        y = y - 1;
    }
<!-- -->
    x = x + 1;
    y = y + 1;
<!-- -->
    if (y < 5) {
        x = x + 1;
        if (y < 3) {
            x = x - 1;
        }
    }
    y = y + 2;

**Possible outputs:**

    22 46
<!-- -->
    11 34 59
<!-- -->
    02 14 26 38
<!-- -->
    02 14 36 48
<!-- -->
    00 11 21 32 42
<!-- -->
    11 21 32 42 53
<!-- -->
    00 11 23 36 410
<!-- -->
    02 14 25 36 47