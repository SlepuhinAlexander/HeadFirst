package headfirst.chapter11.listings.l3;

public class Laundry {
    public void doLaundry() throws LingerieException, PantsException {
        if (Math.random() < 0.5) {
            throw new PantsException();
        } else {
            throw new LingerieException();
        }
    }
}
