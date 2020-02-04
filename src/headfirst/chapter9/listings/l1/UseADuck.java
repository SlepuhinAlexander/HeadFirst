package headfirst.chapter9.listings.l1;

public class UseADuck {
    public static void main(String[] args) {
        Duck d = new Duck();
        /*Here the size of the Duck d is not initialized (equals 0).*/
        d.setSize(42);
    }
}

/*
* output:
* % java UseADuck
* Quack
* */