The code would compile, but its execution would throw an NPE.

    public class TestBox {
        
        Integer I;                      // auto-initialized with null;
        int j;                          // auto-initialized with 0;
        
        public static void main(String[] args) {
            TestBox t = new TestBox();
            t.go();
        }
        
        public void go() {
            j = i;                      // JVM would try to get the int value from Integer object i
                                        // (by calling some of its methods)
                                        // but i is actually null
                                        // thus a method call would throw a NullPointerException.
                                        
            System.out.println(j);      // 0
            System.out.println(i);      // null
        }
    }