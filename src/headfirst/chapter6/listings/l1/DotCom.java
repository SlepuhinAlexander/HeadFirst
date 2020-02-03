package headfirst.chapter6.listings.l1;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Sank";
                System.out.println("You have sunk the " + name + " 'website' :(");
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
