package headfirst.chapter18.listings.l4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceRollingService implements Service {
    JLabel label;
    JComboBox<String> numOfDices;

    @Override
    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll `em!");
        String[] choices = {"1", "2", "3", "4", "5"};
        numOfDices = new JComboBox<>(choices);
        label = new JLabel("");
        button.addActionListener(new RollEmListener());
        panel.add(numOfDices);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    private class RollEmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String diceOutput = "";
            String selection = (String) numOfDices.getSelectedItem();
            assert selection != null;
            int numOfDicesToRoll = Integer.parseInt(selection);
            for (int i = 0; i < numOfDicesToRoll; i++) {
                diceOutput += " " + (int) (Math.random() * 6 + 1);
                label.setText(diceOutput);
            }
        }
    }
}
