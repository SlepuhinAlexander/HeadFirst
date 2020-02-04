**Match code blocks with results**

Here is some code in Java but a bit of it is missing.
You should match the possible code blocks with corresponding results.
Not all results must be used, some of them might be used several times.

    class A {
        int ivar = 7;

        void m1() {
            System.out.print("A's m1, ");
        }
        
        void m2() {
            System.out.print("A's m2, ");
        }
        
        void m3() {
            System.out.print("A's m3, ");
        }
    }
    
    class B extends A {
        void m1() {
            System.out.println("B's m1, ");
        }
    }
    
    class C extends B {
        void m3() {
            System.out.print("C's m3, " + (ivar + 6));
        }
    }
    
    class Mixed2 {
        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            A a2 = new C();
            /*
            * [missing code block]
            */
        }
    }

**Possible code blocks:**

    b.m1();
    c.m2();
    a.m3();
<!-- -->
    c.m1();
    c.m2();
    c.m3();
<!-- -->
    a.m1();
    b.m2();
    c.m3();
<!-- -->
    a2.m1();
    a2.m2();
    a2.m3();

**Possible outputs:**

    A's m1, A's m2, C's m3, 6 
<!-- -->
    B's m1, A's m2, A's m3, 
<!-- -->
    A's m1, B's m2, A's m3, 
<!-- -->
    B's m1, A's m2, C's m3, 13
<!-- -->
    B's m1, C's m2, A's m3, 
<!-- -->
    B's m1, A's m2, C's m3, 6
<!-- -->
    A's m1, A's m2, C's m3, 13