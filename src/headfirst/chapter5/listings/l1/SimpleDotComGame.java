package headfirst.chapter5.listings.l1;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Sank")) {
                isAlive = false;
                System.out.println("It took " + numOfGuesses + " attempt(s)");
            }
        }
    }
}