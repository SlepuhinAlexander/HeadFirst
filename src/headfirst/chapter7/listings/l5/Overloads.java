package headfirst.chapter7.listings.l5;

public class Overloads {
    String uniqueID;

    public static void main(String[] args) {

    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public double addNumbers(double a, double b) {
        return a + b;
    }

    public void setUniqueID(String theID) {
        uniqueID = theID;
    }

    private void setUniqueID(int ssNumber) {
        setUniqueID("" + ssNumber);
    }
}
