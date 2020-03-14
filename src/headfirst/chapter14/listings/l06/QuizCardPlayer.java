package headfirst.chapter14.listings.l06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuizCardPlayer {
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) {
        QuizCardPlayer player = new QuizCardPlayer();
        player.go();
    }

    public void go() {
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(10, 20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nextButton = new JButton("Show Question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.setEnabled(false);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700, 200, 500, 600);
        frame.setVisible(true);
    }

    private void showNextCard() {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }

    private void loadFile(File file) {
        cardList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                makeCard(line);
            }
            reader.close();
            nextButton.setEnabled(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void makeCard(String lineToParse) {
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
    }

    private class NextCardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (isShowAnswer) {
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;
            } else {
                if (currentCardIndex < cardList.size()) {
                    showNextCard();
                } else {
                    display.setText("That was the last card");
                    nextButton.setEnabled(false);
                }
            }
        }
    }

    private class OpenMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }
}
