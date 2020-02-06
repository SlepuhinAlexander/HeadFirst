package headfirst.chapter12.listings.l3;

import javax.swing.*;
import java.awt.*;

public class SimpleGui1C {
    public static void main(String[] args) {
        SimpleGui1C gui = new SimpleGui1C();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Orange rectangular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 400);
        frame.setSize(300, 300);
        frame.setContentPane(new MyDrawPanel());
        frame.setVisible(true);
    }
}

class MyDrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}
