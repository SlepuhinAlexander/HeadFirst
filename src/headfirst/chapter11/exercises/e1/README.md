**Program flow control**

Take a look at given code example. 
What would be the output of its execution?
What if we change the value of `String test` from `"No"` to `"Yes"`?

    public class TestExceptions {
        public static void main(String[] args) {
            String test = "No";
            try {
                System.out.println("Begin try");
                doRisky(test);    
                System.out.println("End try");
            } catch (ScaryException se) {
                System.out.println("Scary exception");
            } finally {
                System.out.println("Finally");
            }
            System.out.println("End of main");
        }
        
        static void doRisky(String test) throws ScaryException {
            System.out.println("Begin dangerous method");
            if ("Yes".equals(test)) {
                throw new ScaryException();
            }
            System.out.println("End dangerous method");
        }
    }