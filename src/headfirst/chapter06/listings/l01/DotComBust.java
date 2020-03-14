package headfirst.chapter06.listings.l01;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three 'websites':");
        System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName() + ".");
        System.out.println("Try to use the least number of moves.");

        for (DotCom dotComToSet : dotComList) {
            dotComToSet.setLocationCells(helper.placeDotCom(3));
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Your turn");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Miss";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Hit")) {
                break;
            }
            if (result.equals("Sank")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All 'websites' are at the bottom. You won.");
        if (numOfGuesses <= 18) {
            System.out.println("It took just " + numOfGuesses + " tuns.");
            System.out.println("Good job!");
        } else {
            System.out.println("You barely made it after " + numOfGuesses + " turns.");
            System.out.println("You haven't even tried.");
        }
    }
}
