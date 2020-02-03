**Work as JVM**

The given java-file is correct source code.
You should work as JVM and decide what would be the output after its execution.

    class Output {
        public static void main(String[] args) {
            Output o = new Output();
            o.go();
        }
    
        void go() {
            int y = 7;
            for (int x = 0; x < 8; x++) {
                y++;
                if (x < 4) {
                    System.out.println(++y + " ");
                }
                if (y > 14) {
                    System.out.println(" x = " + x);
                    break;
                } 
            }
        }
    }

**Possible outputs:**

    % java Output
    12 14
<!-- -->
    % java Output
    12 14 x = 6
<!-- -->
    % java Output
    13 15 x = 6

