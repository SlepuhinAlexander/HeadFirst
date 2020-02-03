package headfirst.chapter6.listings.l1;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Sank";
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
