package headfirst.chapter12.listings.l9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Two buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton labelButton = new JButton("<html>Change<br/>label<html>");
        labelButton.setHorizontalAlignment(JButton.CENTER);
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Change circle");
        colorButton.addActionListener(new ColorListener());
        label = new JLabel("I'm a new label");
        label.setHorizontalAlignment(JLabel.CENTER);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setLocation(800,400);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setText("Ouch!");
        }
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            frame.repaint();
        }
    }

    class MyDrawPanel extends JPanel {
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
            return new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        }
    }
}
