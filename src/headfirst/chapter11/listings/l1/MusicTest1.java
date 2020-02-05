package headfirst.chapter11.listings.l1;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Got a sequencer successfully");
        } catch (MidiUnavailableException e) {
            System.out.println("Failed to get a sequencer");
        }
    }
}
