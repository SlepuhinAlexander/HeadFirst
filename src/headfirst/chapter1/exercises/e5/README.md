**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used only once.
Not all of them will be used.

Your goal is to make a class that will compile, run and result in given output.

    public class PoolPuzzleOne {
        public static void main(String[] args) {
            int x = 0;
            while (_____) {
                ______________________
                if (x < 1) {
                    ______________________
                }
                ______________________
                if (_____) {
                    ____________________________
                    __________
                }
                if (x == 1) {
                    _________________________
                }
                if (_____) {
                    _________________________
                }
                System.out.println("");
                __________
            }
        }
    }

**Expected output**

    % java PoolPuzzleOne
    a noise
    annoys
    an oyster

**Pool**
    
    System.out.print(" ");
    System.out.print("a");
    System.out.print("n");
    System.out.print("an");
<!-- -->
    x > 0
    x < 1
    x > 1
    x > 3
    x > 4
<!-- -->
    x = x + 1;
    x = x + 2;
    x = x - 2;
    x = x - 1;
<!-- -->
    System.out.print("noys");
    System.out.print("oise");
    System.out.print(" oyster");
    System.out.print("annoys");
    System.out.print("noise");