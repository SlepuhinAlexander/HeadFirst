**Work as compiler**

Which pair of methods would you need to put in the given code so it would compile, execute and result in given output?

    public class MonsterTestDrive {
        public static void main(String[] args) {
            Monster[] ma = new Monster[3];
            ma[0] = new Vampire();
            ma[1] = new Dragon();
            ma[2] = new Monster();
            for (int x = 0; x < 3; x++) {
                ma[x].frighten(x);
            }
        }
    }
    
    class Monster {
        /*
        * [method A]
        */
    }
    
    class Vampire extends Monster {
        /*
        * [method B]
        */
    }
    
    class Dragon extends Monster {
        boolean frighten(int degree) {
            System.out.println("Fire breath");
            return true;
        }
    }

**Output**

    % java MonsterTestDrive
    Wanna bite?
    Fire breath
    Grrrr
    
 **Possible methods:**

    /* [method A] */
    boolean frighten(int d) {
        System.out.println("Grrrr");
        return true;
    }
<!-- -->
    /* [method B] */
    boolean frighten(int x) {
        System.out.println("Wanna bite?");
        return false;
    }
----
    /* [method A] */
    boolean frighten(int x) {
        System.out.println("Grrrr");
        return true;
    }
<!-- -->
    /* [method B] */
    int frighten(int f) {
        System.out.println("Wanna bite?");
        return 1;
    }
----
    /* [method A] */
    boolean frighten(int x) {
        System.out.println("Grrrr");
        return false;
    }
<!-- -->
    /* [method B] */
    boolean scare(int x) {
        System.out.println("Wanna bite?");
        return true;
    }
----
    /* [method A] */
    boolean frighten(int z) {
        System.out.println("Grrrr");
        return true;
    }
<!-- -->
    /* [method B] */
    boolean frighten(byte b) {
        System.out.println("Wanna bite?");
        return true;
    }
----
    /* [method A] */
    boolean frighten(int d) {
        System.out.println("Grrrr");
        return true;
    }
<!-- -->
    /* [method B] */
    boolean frighten(int x) {
        System.out.println("Wanna bite?");
        return false;
    }
