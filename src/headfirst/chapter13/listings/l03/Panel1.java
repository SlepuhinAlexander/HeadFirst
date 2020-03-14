package headfirst.chapter13.listings.l03;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }
}
