**Work as compiler**

Check if the given piece of code would compile. Correct the code if not.

    public class BooksTestDrive {
        public static void main(String[] args) {
            Books[] myBooks = new Books[3];
            int x = 0;
            myBooks[0].title = "Essence of Java";
            myBooks[1].title = "Java Gatsby";
            myBooks[2].title = "Java recipe book";
    
            myBooks[0].author = "Bob";
            myBooks[1].author = "Sue";
            myBooks[2].author = "Yang";
    
            while (x < 3) {
                System.out.print(myBooks[x].title);
                System.out.print(" by ");
                System.out.println(myBooks[x].author);
                x = x + 1;
            }
        }
    }
<!-- -->
    public class Hobbits {
        String name;
    
        public static void main(String[] args) {
            Hobbits[] h = new Hobbits[3];
            int z = 0;
    
            while (z < 4) {
                z = z + 1;
                h[z] = new Hobbits();
                h[z].name = "Bilbo";
                if (z == 1) {
                    h[z].name = "Frodo";
                }
                if (z == 2) {
                    h[z].name = "Sam";
                }
                System.out.print(h[z].name + " is ");
                System.out.println("a name of a good hobbit.");
                z = z + 1;
            }
        }
    }
