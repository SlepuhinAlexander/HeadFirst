**Work as garbage collector**

You are given a code example with one line missing and a number of lines to fill in this gap.
You should find which variants would lead to make one more object available for garbage collection.
Consider that "calling other methods" code block takes a long time to execute
 so the garbage collector would definitely work out.

    public class GC {
        public static GC doStuff() {
            GC new GC = new GC();
            doStuff2(newGC);
            return newGC;
        }
        
        public static void main(String[] args) {
            GC gc1;
            GC gc2 = new GC();
            GC gc3 = new GC();
            GC gc4 = gc3;
            gc1 = doStuff();
            /*
            * [missing code block]
            */ 
            // calling other methods
        }
        
        public static void doStuff2(GC copyGC) {
            GC localGC;
        }
    }

**Possible code blocks:**

    copyGC = null;
<!-- -->
    gc2 = null;
<!-- -->
    newGC = gc3;
<!-- -->
    gc1 = null;
<!-- -->
    newGC = null;
<!-- -->
    gc4 = null;
<!-- -->
    gc3 = gc2;
<!-- -->
    gc1 = gc4;
<!-- -->
    gc3 = null;