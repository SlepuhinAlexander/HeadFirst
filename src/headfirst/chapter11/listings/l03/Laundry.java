package headfirst.chapter11.listings.l03;

public class Laundry {
    public void doLaundry() throws ClothingException {
        switch ((int) (Math.random() * 4)) {
            case 0: throw new PantsException();
            case 1: throw new LingerieException();
            case 2: throw new TeeShirtException();
            case 3: throw new DressShirtException();
        }
    }
}
