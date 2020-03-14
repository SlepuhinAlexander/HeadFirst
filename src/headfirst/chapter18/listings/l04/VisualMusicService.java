package headfirst.chapter18.listings.l04;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VisualMusicService implements Service {
    private MyDrawPanel myPanel;

    @Override
    public JPanel getGuiPanel() {
        JPanel mainPanel = new JPanel();
        myPanel = new MyDrawPanel();
        myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
        JButton playItButton = new JButton("Play it");
        playItButton.addActionListener(new PlayItListener());
        mainPanel.add(myPanel);
        mainPanel.add(playItButton);
        return mainPanel;
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
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

    class PlayItListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();
                sequencer.addControllerEventListener(myPanel, new int[]{127});

                Sequence sequence = new Sequence(Sequence.PPQ, 4);
                Track track = sequence.createTrack();
                for (int i = 0; i < 1000; i += 4) {
                    int random = (int) (Math.random() * 126 + 1);
                    if (random < 95) {
                        track.add(makeEvent(ShortMessage.NOTE_ON, 1, random, 100, i));
                        track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, i));
                        track.add(makeEvent(ShortMessage.NOTE_OFF, 1, random, 100, i + 2));
                    }
                }
                sequencer.setSequence(sequence);
                sequencer.setTempoInBPM(480);
                sequencer.start();
            } catch (MidiUnavailableException | InvalidMidiDataException e) {
                e.printStackTrace();
            }
        }
    }


    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage shortMessage) {
            msg = true;
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Random r = new Random();
            if (msg) {
                g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
                g.fillRect(r.nextInt(this.getWidth() - 100), r.nextInt(this.getHeight() - 100),
                        r.nextInt(90) + 10, r.nextInt(90) + 10);
                msg = false;
            }
        }
    }
}
