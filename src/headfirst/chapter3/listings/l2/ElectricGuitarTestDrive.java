package headfirst.chapter3.listings.l2;

public class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.setBrand("Gibson");
        guitar.setNumOfPickups(6);
        guitar.setRockStarUsesIt(true);
        System.out.print("Guitar " + guitar.getBrand());
        System.out.println(" with " + guitar.getNumOfPickups() + " pickups");
        if (guitar.getRockStarUsesIt()) {
            System.out.print("And rock stars use it!");
        }
    }
}
