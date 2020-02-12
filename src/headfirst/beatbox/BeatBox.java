package headfirst.beatbox;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class BeatBox {
    private JFrame theFrame;
    private JList<String> incomingList;
    private JTextField userMessage;
    private ArrayList<JCheckBox> checkboxList;
    private Vector<String> listVector = new Vector<>();
    private String userName;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private HashMap<String, boolean[]> otherSequences = new HashMap<>();
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
            "Hand clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low conga", "Cowbell", "Vibraslap",
            "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    private int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().startUp();
    }

    private void startUp() {
        userName = System.getProperty("user.name");
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            Thread remote = new Thread(() -> {
                try {
                    Object object;
                    while ((object = in.readObject()) != null) {
                        String nameToShow = (String) object;
                        boolean[] checkboxState = (boolean[]) in.readObject();
                        otherSequences.put(nameToShow, checkboxState);
                        listVector.add(nameToShow);
                        incomingList.setListData(listVector);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
            remote.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setUpMidi();
        buildGui();
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
        ArrayList<Integer> trackList;
        sequence.deleteTrack(track);
        sequencer.stop();
        sequencer.close();
        setUpMidi();
        track = sequence.createTrack();
        for (int i = 0; i < 16; i++) {
            trackList = new ArrayList<>();
            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkboxList.get(16 * i + j);
                if (jc.isSelected()) {
                    trackList.add(instruments[i]);
                } else {
                    trackList.add(null);
                }
            }
            makeTracks(trackList);
        }
        track.add(makeEvent(ShortMessage.PROGRAM_CHANGE, 9, 1, 0, 15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void changeSequence(boolean[] checkboxState) {
        for (int i = 0; i < 256; i++) {
            checkboxList.get(i).setSelected(checkboxState[i]);
        }
    }

    private void makeTracks(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < 16; i++) {
            Integer num = it.next();
            if (num != null) {
                track.add(makeEvent(ShortMessage.NOTE_ON, 9, num, 100, i));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 9, num, 100, i + 1));
            }
        }
    }

    private MidiEvent makeEvent(int command, int channel, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(command, channel, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }

    private void buildGui() {
        theFrame = new JFrame("Beat Box");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel background = new JPanel(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        checkboxList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButton start = new JButton("Start");
        start.addActionListener(actionEvent -> buildTrackAndStart());
        buttonBox.add(start);
        JButton stop = new JButton("Stop");
        stop.addActionListener(actionEvent -> sequencer.stop());
        buttonBox.add(stop);
        JButton clear = new JButton("Clear");
        clear.addActionListener(actionEvent -> {
            sequencer.stop();
            sequencer.close();
            for (JCheckBox checkBox : checkboxList) {
                checkBox.setSelected(false);
            }
            setUpMidi();
        });
        buttonBox.add(clear);
        JButton tempoUp = new JButton("Tempo Up");
        tempoUp.addActionListener(actionEvent -> sequencer.setTempoFactor(sequencer.getTempoFactor() * 1.25F));
        buttonBox.add(tempoUp);
        JButton tempoDown = new JButton("Tempo Down");
        tempoDown.addActionListener(actionEvent -> sequencer.setTempoFactor(sequencer.getTempoFactor() * 0.8F));
        buttonBox.add(tempoDown);
        JButton save = new JButton("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileSave = new JFileChooser();
                fileSave.showSaveDialog(theFrame);
                saveFile(fileSave.getSelectedFile());
            }

            private void saveFile(File file) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    for (int i = 0; i < 16; i++) {
                        for (int j = 0; j < 16; j++) {
                            if (checkboxList.get(i * 16 + j).isSelected()) {
                                writer.write("1");
                            } else {
                                writer.write("0");
                            }
                            writer.write(" ");
                        }
                        writer.write("\n");
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        buttonBox.add(save);
        JButton load = new JButton("Load");
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileOpen = new JFileChooser();
                fileOpen.showOpenDialog(theFrame);
                loadFile(fileOpen.getSelectedFile());
            }

            private void loadFile(File file) {
                sequencer.stop();
                sequencer.close();
                setUpMidi();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    for (int i = 0; i < 16; i++) {
                        line = reader.readLine();
                        if (line != null) {
                            String[] tokens = line.split(" ");
                            for (int j = 0; j < Math.min(tokens.length, 16); j++) {
                                if (Integer.parseInt(tokens[j]) == 1) {
                                    checkboxList.get(i * 16 + j).setSelected(true);
                                } else {
                                    checkboxList.get(i * 16 + j).setSelected(false);
                                }
                            }
                            for (int j = tokens.length; j < 16; j++) {
                                checkboxList.get(i * 16 + j).setSelected(false);
                            }
                        } else {
                            for (int j = 0; j < 16; j++) {
                                checkboxList.get(i * 16 + j).setSelected(false);
                            }
                        }
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        buttonBox.add(load);
        incomingList = new JList<>();
        incomingList.addListSelectionListener(listSelectionEvent -> {
            if (!listSelectionEvent.getValueIsAdjusting()) {
                String selected = incomingList.getSelectedValue();
                if (selected != null) {
                    boolean[] selectedState = otherSequences.get(selected);
                    changeSequence(selectedState);
                    buildTrackAndStart();
                }
            }
        });
        incomingList.setListData(listVector);
        incomingList.ensureIndexIsVisible(incomingList.getModel().getSize());
        JScrollPane scroller = new JScrollPane(incomingList);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        buttonBox.add(scroller);
        userMessage = new JTextField();
        buttonBox.add(userMessage);
        JButton send = new JButton("Send");
        send.addActionListener(actionEvent -> {
            boolean[] checkboxState = new boolean[256];
            for (int i = 0; i < 256; i++) {
                checkboxState[i] = checkboxList.get(i).isSelected();
            }
            try {
                out.writeObject(userName + ": " + userMessage.getText());
                out.writeObject(checkboxState);
            } catch (IOException e) {
                e.printStackTrace();
            }
            userMessage.setText("");
            userMessage.requestFocus();
        });
        buttonBox.add(send);
        Box namesBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            namesBox.add(new Label(instrumentNames[i]));
        }
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        JPanel mainPanel = new JPanel(grid);
        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }
        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, namesBox);
        background.add(BorderLayout.CENTER, mainPanel);
        theFrame.getContentPane().add(background);
        theFrame.setBounds(400, 300, 400, 400);
        theFrame.pack();
        theFrame.setVisible(true);
    }
}