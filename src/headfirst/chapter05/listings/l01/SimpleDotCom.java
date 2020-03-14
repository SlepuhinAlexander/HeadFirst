package headfirst.chapter05.listings.l01;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(int guess) {
        String result = "Miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Sank";
        }
        System.out.println(result);
        return result;
    }
}
