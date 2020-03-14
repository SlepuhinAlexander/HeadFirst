package headfirst.chapter13.listings.l06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox1 {
    JCheckBox check;

    public static void main(String[] args) {
        CheckBox1 gui = new CheckBox1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(800, 400, 300, 300);
        check = new JCheckBox("Goes to 11");
        check.addItemListener(new MyItemListener());
        frame.getContentPane().add(BorderLayout.NORTH, check);
        frame.setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            String onOrOff = "off";
            if (check.isSelected()) {
                onOrOff = "on";
            }
            System.out.println("Checkbox is " + onOrOff);
        }
    }

}
