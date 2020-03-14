package headfirst.chapter03.exercises.e01;

/* It would compile.
 * But it will fail on execution with NullPointerException since the elements of the myBooks array are not initialized
 * */
public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        for (int i = 0; i < 3; i++) {   // added line
            myBooks[i] = new Books();   // added line
        }                               // added line
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
