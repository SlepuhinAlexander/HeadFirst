package headfirst.chapter4.exercises.e1;

/*This code is correct. It will compile and execute*/
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
/*
* output:
* %java XCopy
* 42 84
* */