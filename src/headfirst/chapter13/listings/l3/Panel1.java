package headfirst.chapter13.listings.l3;

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
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }
}
