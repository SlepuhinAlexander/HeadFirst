package headfirst.chapter12.listings.l6;

import javax.swing.*;
import java.awt.*;

public class SimpleGui1F {
    public static void main(String[] args) {
        SimpleGui1F gui = new SimpleGui1F();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Gradient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 400);
        frame.setSize(300, 300);
        frame.setContentPane(new MyDrawPanelE());
        frame.setVisible(true);
    }
}

class MyDrawPanelE extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = ((Graphics2D) g);
        GradientPaint gradient = new GradientPaint(75, 75, Color.BLUE, 225, 225, Color.ORANGE);
        g2d.setPaint(gradient);
        g2d.fillOval(75,75,150,150);
    }
}
