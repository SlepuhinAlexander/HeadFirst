**Work as compiler**

Here is some Java code.
You should work as compiler and decide would if compile or not.
How to fix it if not?
What would be the output when you fix (if needed) and run it?

    class StaticSuper {
    
        static {
            System.out.println("Parent static block");
        }
        
        StaticSuper {
            System.out.println("Parent constructor");
        }
    }
    
    public class StaticTests extends StaticSuper {
        static int rand;
        
        static {
            rand = (int) (Math.random() * 6);
            System.out.println("Static block " + rand);
        }
        
        StaticTests() {
            System.out.println("Constructor");
        }
        
        public static void main(String[] args) {
            System.out.println("Inside main");
            StaticTests st = new StaticTests();
        }
    }

**Possible outputs:**

    % java StaticTests
    Static block 4
    Inside main
    Parent static block
    Parent constructor
    Constructor
<!-- -->
    % java StaticTests
    Parent static block
    Static block 4
    Inside main
    Parent constructor
    Constructor