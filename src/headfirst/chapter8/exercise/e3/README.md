**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used several times.
Not all of them will be used.

Your goal is to make a class that will compile, run and result in given output.

    _________ Nose {
        _____________________
    }
    
    abstract class Picasso implements ____ {
        ______________________
            return 7;
        }
    }
    
    class ______ _______ _______ { }
    
    class ____ __________ ____ {
        ______________________
            return 5;
        }
    }
    
    public _____ ____ extends Clowns{
        public static void main(String[] args) {
            _______________________
            i[0] = new _______
            i[1] = new _________
            i[2] = new _______
            for (int x = 0; x < 3; x++) {
                System.out.println(______________ + " " + _______________);
            }
        }
    }

**Expected output**

    % java ____
    5 class Acts
    7 class Clowns
    _______ Of76
    
**Pool**

    Acts();
    Nose();
    Of76();
    Clowns();
    Picasso();
<!-- -->
    class
    extends
    interface
    implements
<!-- -->
    i
    i()
    i(x)
    i[x]
<!-- -->
    class
    5 class
    7 class
    7 public class
<!-- -->
    Of76[] i = new Nose[3];
    Of76[3] i;
    Nose[] i = new Nose();
    Nose[] i = new Nose[3];
<!-- -->
    public int iMethod();
    public int iMethod{}
    public int iMethod() {
    public int iMethod() { }
<!-- -->
    i.iMethod(x)
    i(x).iMethod[]
    i[x].iMethod()
    i[x].iMethod[]
<!-- -->
    Acts
    Nose
    Of76
    Clowns
    Picasso