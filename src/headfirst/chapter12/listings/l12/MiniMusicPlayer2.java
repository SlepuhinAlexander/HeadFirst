package headfirst.chapter12.listings.l12;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try (Sequencer sequencer = MidiSystem.getSequencer()){
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this,eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            for (int i = 5; i < 60; i += 4) {
                track.add(makeEvent(ShortMessage.NOTE_ON, 1, i, 100, i));
                track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, i));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
            Thread.sleep(5000);
        } catch (MidiUnavailableException | InvalidMidiDataException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void controlChange(ShortMessage shortMessage) {
        System.out.print("la");
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }
}
