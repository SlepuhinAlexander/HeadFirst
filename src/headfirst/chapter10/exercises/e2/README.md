**Work as compiler**

Would this code compile?
What would it do if yes?
Why if no?

    public class TestBox {
        
        Integer I;
        int j;
        
        public static void main(String[] args) {
            TestBox t = new TestBox();
            t.go();
        }
        
        public void go() {
            j = i;
            System.out.println(j);
            System.out.println(i);
        }
    }