**Work as compiler**

What would be the result of executing the following code.
Choose one of two options.

    public class Animal {
        public Animal() {
            System.out.println("Creating Animal");
        }
    }
<!-- -->
    public class Hippo extends Animal {
        public Hippo() {
            System.out.println("Creating Hippo");
        }
    }
<!-- -->
    public class TestHippo {
        public static void main(String[] args) {
            System.out.println("Beginning...");
            Hippo h = new Hippo();
        }
    }

**Possible outputs:**

    % java TestHippo
    Beginning...
    Creating Animal
    Creating Hippo
<!-- -->
    % java TestHippo
    Beginning...
    Creating Hippo
    Creating Animal