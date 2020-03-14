package headfirst.chapter13.listings.l08;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class BeatBox {
    private static final String path = System.getProperty("java.class.path") + "/" +
            BeatBox.class.getPackageName().replace('.', '/') + "Checkbox.ser";
    private ArrayList<JCheckBox> checkboxList;
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
            "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low conga", "Cowbell", "Vibraslap",
            "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    private int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGui();
    }

    private void buildGui() {
        JFrame theFrame = new JFrame("Beat Box");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkboxList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton clear = new JButton("Clear");
        clear.addActionListener(new MyClearListener());
        buttonBox.add(clear);

        JButton upTempo = new JButton("Tempo up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton send = new JButton("Send");
        send.addActionListener(new MySendListener());
        buttonBox.add(send);

        JButton readIn = new JButton("Read in");
        readIn.addActionListener(new MyReadInListener());
        buttonBox.add(readIn);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        JPanel mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        theFrame.setBounds(800, 400, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList;

        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkboxList.get(j + 16 * i);
                if (jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            }
            makeTracks(trackList);
            track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, 16));
        }
        track.add(makeEvent(ShortMessage.PROGRAM_CHANGE, 9, 1, 0, 15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(ShortMessage.NOTE_ON, 9, key, 100, i));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 9, key, 100, i + 1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
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

    private class MyStartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            buildTrackAndStart();
        }
    }

    private class MyStopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            sequencer.stop();
        }
    }

    private class MyClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            for (int i = 0; i < 256; i++) {
                sequencer.stop();
                checkboxList.get(i).setSelected(false);
            }
        }
    }

    private class MyUpTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor(tempoFactor * 1.03f);
        }
    }

    private class MyDownTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor(tempoFactor * 0.97f);
        }
    }

    private class MySendListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            boolean[] checkboxState = new boolean[256];
            for (int i = 0; i < 256; i++) {
                checkboxState[i] = checkboxList.get(i).isSelected();
            }
            try {
                FileOutputStream fileStream = new FileOutputStream(new File(path));
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(checkboxState);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyReadInListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            boolean[] checkboxState = null;
            try {
                FileInputStream fileIn = new FileInputStream(new File(path));
                ObjectInputStream is = new ObjectInputStream(fileIn);
                checkboxState = ((boolean[]) is.readObject());
                is.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 256; i++) {
                assert checkboxState != null;
                checkboxList.get(i).setSelected(checkboxState[i]);
            }
            sequencer.stop();
            buildTrackAndStart();
        }
    }
}
