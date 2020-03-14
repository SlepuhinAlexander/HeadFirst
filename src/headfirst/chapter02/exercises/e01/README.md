**Work as compiler**

Check if the given piece of code would compile. Correct the code if not.

    class TapeDeck {
        boolean canRecord = false;
    
        void playTape() {
            System.out.println("The tape is playing");
        }
    
        void recordTape() {
            System.out.println("Recording the tape");
        }
    }
    
    public class TapeDeckTestDrive {
        public static void main(String[] args) {
            t.canRecord = true;
            t.playTape();
    
            if (t.canRecord == true) {
                t.recordTape();
            }
        }
    }
<!-- -->
    public class DVDPlayer {
        boolean canRecord = false;
    
        void recordDVD() {
            System.out.println("Recording the DVD");
        }
    }
    
    public class DVDPlayerTestDrive {
        public static void main(String[] args) {
        
            DVDPlayer d = new DVDPlayer();
            d.canRecord = true;
            d.playDVD();
            
            if (d.canRecord) {
                d.recordDVD();
            }
        }
    }
