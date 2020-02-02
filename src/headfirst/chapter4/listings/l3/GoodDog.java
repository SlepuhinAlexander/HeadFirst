package headfirst.chapter4.listings.l3;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Bark! Bark!");
        } else if (size > 14) {
            System.out.println("Woof! Woof!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
