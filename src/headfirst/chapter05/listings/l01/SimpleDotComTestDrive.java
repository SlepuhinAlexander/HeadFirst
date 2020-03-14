package headfirst.chapter05.listings.l01;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuess = 2;
        String testResult = "Failed";
        String result = dot.checkYourself(userGuess);
        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);
    }
}
