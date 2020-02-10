package headfirst.chapter13.listings.l1;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        BorderLayoutTest gui = new BorderLayoutTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Border layout test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }
}
