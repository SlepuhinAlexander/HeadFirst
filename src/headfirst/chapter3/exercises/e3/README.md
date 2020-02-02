**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used more than once.
Not all of them will be used.

Your goal is to make a class that will compile, run and result in given output.

    class Triangle {
        double area;
        int height;
        int length;
    
        public static void main(String[] args) {
            __________
            ________________________________
            while (_____) {
                _______________________
                _____.height = (x + 1) * 2;
                _____.length = x + 4;
                ________________
                System.out.print("triangle " + x + ", area");
                System.out.println(" = " + _____.area);
                __________
            }
            __________
            Triangle t5 = ta[2];
            ta[2].area = 343;
            System.out.print("y = " + y);
            System.out.println(", area t5 = " + t5.area);
        }
    
        void setArea() {
            ____ = (height * length) / 2d;
        } 
    }

**Expected output**

    % java Triangle
    triangle 0, area = 4.0
    triangle 1, area = 10.0
    triangle 2, area = 18.0
    triangle 3, area = ____
    y = __________________
    
**Bonus question**

Use code pieces form the pool to fill in the gaps in the output.

**Pool**

    x
    y   
<!-- -->
    area
    ta.area
    ta.x.area
    ta[x].area
<!-- -->
    4, t5 area = 18.0
    4, t5 area = 343.0
    27, t5 area = 18.0
    27, t5 area = 343.0
<!-- -->
    Triangle[] ta = new Triangle(4);
    Triangle ta = new [] Triangle[4];
    Triangle[] ta = new Triangle[4];
<!-- -->
    ta[x] = setArea();
    ta.x = setArea();
    ta[x].setArea();
<!-- -->
    int x;
    int y;
    int x = 0;
    int x = 1;
    int y = x;
<!-- -->
    x = x + 1;
    x = x + 2;
    x = x - 1;
<!-- -->
    ta.x
    ta(x)
    ta[x]
<!-- -->
    x < 4
    x < 5
<!-- -->
    28.0
    30.0
<!-- -->
    ta = new Triangle();
    ta[x] = new Triangle();
    ta.x = new Triangle();