**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used more than once.
Not all of them will be used.

Your goal is to make a class that will compile, run and result in given output.

    class EchoTestDrive {
        public static void main(String[] args) {
            Echo e1 = new Echo();
            _____________________
            int x = 0;
            while (_____) {
                e1.hello();
                ________________________
                if (_____) {
                    e2.count = e2.count + 1;
                }
                if (_____) {
                    e2.count = e2.count + e1.count;
                }
                x = x + 1;
            }
            System.out.println(e2.count);
        }
    }
    
     class ____ {
        int _____ = 0;
        
        void _______ {
            System.out.println("hellooooo");
        }
    }


**Expected output**

    % java EchoTestDrive
    hellooooo
    hellooooo
    hellooooo
    hellooooo
    10
    
**Bonus question**

How would you solve the puzzle if the last output line were 24?

**Pool**

    e1 = e1 + 1;
    e1 = count + 1;
    e1.count = count + 1;
    e1.count = e1.count + 1;   
<!-- -->
    x
    y
    e2
    count;
<!-- -->
    x < 4
    x < 5
    x > 0
    x > 1
<!-- -->
    Echo
    Tester
    echo()
    count()
    hello()
<!-- -->
    e2 = e1;
    Echo e2;
    Echo e2 = e1;
    Echo e2 = new Echo();
<!-- -->
    x == 3;
    x == 4;