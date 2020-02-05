package headfirst.chapter11.listings.l3;

public class Foo {
    public void go() {
        Laundry laundry = new Laundry();
        try {
            laundry.doLaundry();
        } catch (PantsException e) {
            System.out.println("PantsException");
        } catch (LingerieException e) {
            System.out.println("LingerieException");
        }
    }

    public static void main(String[] args) {
        new Foo().go();
    }
}
