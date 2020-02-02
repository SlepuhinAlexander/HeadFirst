**Match code blocks with results**

Here is some code in Java but a bit of it is missing.
You should match the possible code blocks with corresponding results.
Not all results must be used, some of them might be used several times.

    Public class Mix4 {
        int counter = 0
        public static void main(String[] args) {
            int count = 0;
            Mix4[] m4a = new Mix4[20];
            int x = 0;
            while (/* [first missing part] */) {
                m4a[x] = new Mix4();
                m4a[x].counter = m4a[x].counter + 1;
                count = count + 1;
                count = count + m4a[x].maybeNew(x);
                x = x + 1;
            }
            System.out.println(count + " " + m4a[1].counter);
        }
        
        public int maybeNew(int index) {
            if (/* [second missing part] */) {
                Mix4 m4 = new Mix4();
                m4.counter = m4.counter + 1;
                return 1;
            }
            return 0;
        }
    }

**Possible code blocks:**

    x < 9
    
    index < 5
<!-- -->
    x < 20
    
    index < 5
<!-- -->
    x < 7
    
    index < 7
<!-- -->
    x < 19
    
    index < 1

**Possible outputs:**

    14 7
<!-- -->
    9 5
<!-- -->
    19 1
<!-- -->
    14 1
<!-- -->
    25 1
<!-- -->
    7 7
<!-- -->
    20 1
<!-- -->
    20 5