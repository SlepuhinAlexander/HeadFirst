package headfirst.chapter13.listings.l1;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }
}
