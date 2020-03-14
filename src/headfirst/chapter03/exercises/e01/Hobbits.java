package headfirst.chapter03.exercises.e01;

/* It would compile.
 * But it will fail on execution with ArrayIndexOutOfBoundsException since when trying to access element h[3] or h[4].
 * */
public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {     // changed the value to compare with from 4 to 3
//            z = z + 1;    // this line is shifted down.
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
