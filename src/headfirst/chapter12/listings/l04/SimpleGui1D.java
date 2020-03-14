package headfirst.chapter12.listings.l04;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SimpleGui1D {
    public static void main(String[] args) {
        SimpleGui1D gui = new SimpleGui1D();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Catzilla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800,400);
        frame.setSize(300,300);
        frame.setContentPane(new MyDrawPanelD());
        frame.setVisible(true);
    }
}

class MyDrawPanelD extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource("catzilla.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image,0,0,this);
    }
}
