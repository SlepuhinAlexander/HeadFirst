package headfirst.chapter12.listings.l13;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MiniMusicPlayer3 {
    private static JFrame frame = new JFrame("Music player");
    private static MyDrawPanel panel = new MyDrawPanel();
    private static Random r = new Random();

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
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

    public void setUpGui() {
        frame.setContentPane(panel);
        frame.setBounds(800, 400, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void go() {
        setUpGui();
        try (Sequencer sequencer = MidiSystem.getSequencer()) {
            sequencer.open();
            sequencer.addControllerEventListener(panel, new int[]{127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int rr;
            for (int i = 0; i < 60; i++) {
                rr = r.nextInt(50) + 1;
                track.add(makeEvent(ShortMessage.NOTE_ON, 1, rr, 100, i));
                track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, i));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 1, rr, 100, i + 2));
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(120);
            sequencer.start();
            Thread.sleep(5000);
        } catch (MidiUnavailableException | InvalidMidiDataException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyDrawPanel extends JPanel implements ControllerEventListener {
        private boolean msg = false;


        @Override
        protected void paintComponent(Graphics g) {
            if (msg) {
                g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
                g.fillRect(r.nextInt(this.getWidth() - 50), r.nextInt(this.getHeight() - 50),
                        r.nextInt(40) + 1, r.nextInt(40) + 1);
                msg = false;
            }
        }

        @Override
        public void controlChange(ShortMessage shortMessage) {
            msg = true;
            repaint();
        }
    }

}