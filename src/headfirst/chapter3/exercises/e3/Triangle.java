package headfirst.chapter3.exercises.e3;

public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", area t5 = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2d;  // changed the divider to 2d to make it double type literal.
    }                                   // otherwise the formula is incorrect since it uses the integer division.
}

/*
 * output:
 * triangle 0, area = 4.0
 * triangle 1, area = 10.0
 * triangle 2, area = 18.0
 * triangle 3, area = 28.0
 * y = 4, area t5 = 343.0
 * */