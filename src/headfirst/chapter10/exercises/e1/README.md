**Work as compiler**

Taking into account all you know about static and final modifiers choose which code blocks would not compile and why.

    public class Foo {
        static int x;
        
        public void go() {
            System.out.println(x);
        }
    }
<!-- -->
    public class Foo2 {
        int x;
        
        public static void go() {
            System.out.println(x);
        }
    }
<!-- -->
    public class Foo3 {
        final int x;
        
        public void go() {
            System.out.println(x);
        }
    }
<!-- -->
    public class Foo4 {
        static final int x = 12;
        
        public void go() {
            System.out.println(x);
        }
    }
<!-- -->
    public class Foo5 {
        static final int x = 12;
        
        public void go(final int x) {
            System.out.println(x);
        }
    }
<!-- -->
    public class Foo6 {
        int x = 12;
        
        public static void go(final int x) {
            System.out.println(x);
        }
    }