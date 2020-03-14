    /* No errors, would compile */
    public class Foo {
        static int x;
        
        public void go() {
            System.out.println(x);
        }
    }
<!-- -->
    /* Would not compile */
    public class Foo2 {
        int x;
        
        public static void go() {
            System.out.println(x);  // non-static variable x
        }                           // cannot be accessed from static context
    }
<!-- -->
    /* No errors, would compile */
    public class Foo3 {
        final int x;
        
        public void go() {
            System.out.println(x);  // variable x is only used, not changed 
        }
    }
<!-- -->
    /* No errors, would compile*/
    public class Foo4 {
        static final int x = 12;    // X would be better name according to naming policy
        
        public void go() {
            System.out.println(x);  // variable x is only used, not changed
        }
    }
<!-- -->
    /* No errors, would compile */
    public class Foo5 {
        static final int x = 12;
        
        public void go(final int x) {   // class variable x is not used at all
            System.out.println(x);      // this x is local variable from method arguments 
        }
    }
<!-- -->
    /* No errors, would compile */
    public class Foo6 {
        int x = 12;
        
        public static void go(final int x) {
            System.out.println(x);          // this x is local variable from method arguments 
        }                                   // it is only used, not changed
    }