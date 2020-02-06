package headfirst.chapter12.listings.l10;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 10;
    int y = 10;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Simple animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setLocation(800, 400);
        frame.setSize(300, 300);
        frame.setVisible(true);
        while (x < drawPanel.getWidth() - 50 && y < drawPanel.getHeight() - 50) {
            x += 3;
            y += 3;
            drawPanel.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 40, 40);
        }
    }
}

