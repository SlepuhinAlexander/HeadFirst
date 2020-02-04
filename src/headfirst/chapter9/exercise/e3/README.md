**Work as compiler**

Some constructors of SonOfBoo class would not compile.
Mach the given error messages with constructor calls that are incorrect.

    public class Boo {
        public Boo(int i) { }
        
        public Boo(String s) { }
        
        public Boo(String s, int i) { }
    }
<!-- -->
    public class SonOfBoo extends Boo {
    
        pubic SonOfBoo() {
            super("Boo");
        }
    
        pubic SonOfBoo(int i) {
            super("Fred");
        }
    
        pubic SonOfBoo(String s) {
            super("42");
        }
    
        pubic SonOfBoo(int i, String s) {
        }
    
        pubic SonOfBoo(String a, String b, String c) {
            super(a,b);
        }
    
        pubic SonOfBoo(int i, int j) {
            super("man", j);
        }
    
        pubic SonOfBoo(int i, int x, int y) {
            super(i, "star");
        }
    }

**Possible error messages:**

    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo(java.lang.String,java.lang.String)
<!-- -->
    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo(int,java.lang.String)
<!-- -->
    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo()