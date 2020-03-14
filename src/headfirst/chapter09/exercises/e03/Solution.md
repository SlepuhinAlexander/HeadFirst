    pubic SonOfBoo() {
        super("Boo");
    }
<!-- -->
correct, would compile

----
    pubic SonOfBoo(int i) {
        super("Fred");
    }
<!-- -->
correct, would compile

----
    pubic SonOfBoo(String s) {
        super("42");
    }
<!-- -->
correct, would compile

----
    pubic SonOfBoo(int i, String s) {
    }
<!-- -->
    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo()
----
    pubic SonOfBoo(String a, String b, String c) {
        super(a,b);
    }
<!-- -->
    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo(java.lang.String,java.lang.String)
----
    pubic SonOfBoo(int i, int j) {
        super("man", j);
    }
<!-- -->
correct, would compile

----
    pubic SonOfBoo(int i, int x, int y) {
        super(i, "star");
    }
<!-- -->
    % javac SonOfBoo.java
    cannot resolve symbol
    symbol : constructor Boo(int,java.lang.String)