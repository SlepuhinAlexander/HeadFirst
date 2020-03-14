package headfirst.chapter06.listings.l01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        assert inputLine != null;
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String temp;
        int[] coordinates = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location;

        comCount++;
        int increment = 1;
        int gridLength = 7;
        if (comCount % 2 == 1) {
            increment = gridLength;
        }

        while (!success && attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coordinates[x++] = location;
                    location += increment;
                    if (location >= gridSize) {
                        success = false;
                    }
                    if (x > 0 && location % gridLength == 0) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        int x = 0;
        int row;
        int column;
        while (x < comSize) {
            grid[coordinates[x]] = 1;
            row = coordinates[x] / gridLength;
            column = coordinates[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
