package headfirst.chapter12.listings.l5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleGui1E {
    public static void main(String[] args) {
        SimpleGui1E gui = new SimpleGui1E();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Random color oval");
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
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Random r = new Random();
        g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        g.fillOval((this.getWidth() - 100) / 2, (this.getHeight() - 100) / 2, 100, 100);
    }
}