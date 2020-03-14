package headfirst.chapter04.listings.l02;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}