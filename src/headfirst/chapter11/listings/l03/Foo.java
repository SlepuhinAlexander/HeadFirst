package headfirst.chapter11.listings.l03;

public class Foo {
    public void go() {
        Laundry laundry = new Laundry();
        try {
            laundry.doLaundry();
        } catch (TeeShirtException e) {
            System.out.println("TeeShirtException");
        } catch (LingerieException e) {
            System.out.println("LingerieException");
        } catch (ClothingException e) {
            System.out.println("ClothingException");
        }
    }

    public static void main(String[] args) {
        new Foo().go();
    }
}
