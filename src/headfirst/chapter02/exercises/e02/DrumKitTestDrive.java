package headfirst.chapter02.exercises.e02;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if (d.snare) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
