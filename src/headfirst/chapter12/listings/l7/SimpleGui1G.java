package headfirst.chapter12.listings.l7;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleGui1G {
    public static void main(String[] args) {
        SimpleGui1G gui = new SimpleGui1G();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Random gradient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 400);
        frame.setSize(300, 300);
        frame.setContentPane(new MyDrawPanelG());
        frame.setVisible(true);
    }
}

class MyDrawPanelG extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Dimension size = new Dimension(150, 150);
        Point location = new Point((this.getWidth() - size.width) / 2, (this.getHeight() - size.height) / 2);
        Graphics2D g2d = ((Graphics2D) g);
        GradientPaint gradient = new GradientPaint(location, randomColor(), new Point(location.x + size.width,
                location.y + size.height), randomColor());
        g2d.setPaint(gradient);
        g2d.fillOval(location.x, location.y, size.width, size.height);
    }

    private Color randomColor() {
        Random r = new Random();
        return new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }
}