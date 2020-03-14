package headfirst.chapter05.listings.l01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public int getUserInput(String prompt) {
        int input = 0;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String inputLine = is.readLine();
            if (inputLine.length() == 0) {
                System.out.println("Incorrect input");
                return getUserInput(prompt);
            }
            input = Integer.parseInt(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input");
            return getUserInput(prompt);
        }
        return input;
    }
}
