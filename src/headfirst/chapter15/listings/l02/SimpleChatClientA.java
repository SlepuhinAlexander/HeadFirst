package headfirst.chapter15.listings.l02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

    private void setUpNetworking() {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("Networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void go() {
        setUpNetworking();
        JFrame frame = new JFrame("Simple chat client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setBounds(700, 350, 400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}