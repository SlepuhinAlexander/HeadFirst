package headfirst.chapter12.listings.l06;

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
        Dimension size = new Dimension(150, 150);
        Point location = new Point((this.getWidth() - size.width) / 2, (this.getHeight() - size.height) / 2);
        Graphics2D g2d = ((Graphics2D) g);
        GradientPaint gradient = new GradientPaint(location, Color.BLUE, new Point(location.x + size.width,
                location.y + size.height), Color.ORANGE);
        g2d.setPaint(gradient);
        g2d.fillOval(location.x, location.y, size.width, size.height);
    }
}
