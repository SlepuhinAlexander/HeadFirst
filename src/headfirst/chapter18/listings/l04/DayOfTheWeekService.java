package headfirst.chapter18.listings.l04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheWeekService implements Service {
    private JLabel outputLabel;
    private JTextField day;
    private JComboBox<String> month;
    private JTextField year;

    @Override
    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Do it");
        button.addActionListener(new DoItListener());
        outputLabel = new JLabel("");
        day = new JTextField(8);
        DateFormatSymbols dateStuff = new DateFormatSymbols();
        month = new JComboBox<>(dateStuff.getMonths());
        year = new JTextField(8);
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Day"));
        inputPanel.add(day);
        inputPanel.add(new JLabel("Month"));
        inputPanel.add(month);
        inputPanel.add(new JLabel("Year"));
        inputPanel.add(year);
        panel.add(inputPanel);
        panel.add(button);
        panel.add(outputLabel);
        return panel;
    }

    private class DoItListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day.getText()));
            c.set(Calendar.MONTH, month.getSelectedIndex());
            c.set(Calendar.YEAR, Integer.parseInt(year.getText()));
            Date date = c.getTime();
            outputLabel.setText((new SimpleDateFormat("EEEE")).format(date));
        }
    }
}
