package headfirst.chapter01.listings.l06;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println("Get one more.");
            System.out.println("Run it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
                System.out.println();
            } else {
                System.out.println("No more beer on the wall");
            }
        }
    }
}
