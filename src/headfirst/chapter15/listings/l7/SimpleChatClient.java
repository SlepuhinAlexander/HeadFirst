package headfirst.chapter15.listings.l7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    BufferedWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void go() {
        setUpNetworking();
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        incoming = new JTextArea(24, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(scroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setBounds(700, 350, 400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                writer.write(outgoing.getText());
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                    incoming.setCaretPosition(incoming.getDocument().getLength());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}