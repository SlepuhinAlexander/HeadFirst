**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used only once.
Not all of them will be used.

Your goal is to make a class that will compile, run and result in given output.

    public class Puzzle4 {
        public static void main(String[] args) {
            _________________________________
            int y = 1;
            int x = 0;
            int result = 0;
            while (x < 6) {
                ________________________
                ________________
                y = y * 10;
                __________
            }
            x = 6;
            while (x > 0) {
                __________
                result = result + __________________
            }
            System.out.println("Result " + result);
        }
    }
    
    class ________ {
        int ivar;
    
        ______ ___ doStuff(int ______) {
            if (ivar > 100) {
                return ______________
            } else {
                return ____________________
            }
        }
    }

**Expected output**

    % java Puzzle4
    Result 543345
    
**Pool**

    ivar = x;
    obs.ivar = x;
    obs[x].ivar = x;
    obs[x].ivar = y;
<!-- -->
    Puzzle4[] obs = new Puzzle4[6];
    Puzzle4b[] obs = new Puzzle4b[6];
    Puzzle4b[] obs = new Puzzle4[6];
<!-- -->
    doStuff(x);
    obs.doStuff(x);
    obs[x].doStuff(factor);
    obs[x].doStuff(x);
<!-- -->
    ivar
    factor
    public
    private
<!-- -->
    ivar + factor;
    ivar * (2 + factor);
    ivar * (5 - factor);
    ivar * factor; 
<!-- -->
    x = x + 1;
    x = x - 1;
<!-- -->
    Puzzle4
    Puzzle4b
    Puzzle4b()
<!-- -->
    obs[x] = new Puzzle4b(x);
    obs[] = new Puzzle4b();
    obs[x] =new Puzzle4b();
    obs = new Puzzle4b();
<!-- -->
    int
    short