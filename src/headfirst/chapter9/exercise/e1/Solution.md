    d[0] = new Duck();
<!-- -->
    public Duck(){
        System.out.println("Duck type 1");
    }
----
    d[1] = new Duck(density, weight);
<!-- -->
    public Duck(float density, int max){
        floatability = density;
        maxSpeed = max;
        System.out.println("Duck type 5");
    }
----
    d[2] = new Duck(name, feathers);
<!-- -->
    public Duck(String n, long[] f){
        name = n;
        feathers = f;
        System.out.println("Duck type 3");
    }
----
    d[3] = new Duck(canFly);
<!-- -->
    public Duck(boolean fly){
        canFly = fly;
        System.out.println("Duck type 2");
    }
----
    d[4] = new Duck(3.3F, airspeed);
<!-- -->
    public Duck(float density, int max){
        floatability = density;
        maxSpeed = max;
        System.out.println("Duck type 5");
    }
----
    d[5] = new Duck(false);
<!-- -->
    public Duck(boolean fly){
        canFly = fly;
        System.out.println("Duck type 2");
    }
----
    d[6] = new Duck(airspeed, density);
<!-- -->
    public Duck(int w, float f){
        pounds = w;
        floatability = f;
        System.out.println("Duck type 4");
    }