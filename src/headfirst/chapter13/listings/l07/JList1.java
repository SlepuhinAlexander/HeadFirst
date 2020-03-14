package headfirst.chapter13.listings.l07;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JList1 {
    private JList<String> list;

    public static void main(String[] args) {
        JList1 gui = new JList1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        list = new JList<>(new String[]{"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"});
        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new MyListSelectionListener());
        panel.add(scroller);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setBounds(800, 400, 300, 300);
        frame.setVisible(true);
    }

    class MyListSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent listSelectionEvent) {
            if (!listSelectionEvent.getValueIsAdjusting()) {
                System.out.println(list.getSelectedValue());
            }
        }
    }

}
