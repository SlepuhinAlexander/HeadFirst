package headfirst.chapter13.listings.l3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField1 {
    JTextField field;

    public static void main(String[] args) {
        TextField1 gui = new TextField1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        field = new JTextField("Your name");
        field.addActionListener(new MyActionListener());
        field.requestFocus();
        frame.add(BorderLayout.NORTH,field);
        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(field.getText());
            field.setText("Your name");
            field.requestFocus();
        }
    }
}
