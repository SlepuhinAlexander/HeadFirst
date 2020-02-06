**Work as compiler**

Here is some Java code.
You should work as compiler and decide would it compile or not.
How not fix it if not.

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
    public class InnerButton {
        JFrame frame;
        JButton b;
    
        public static void main(String[] args) {
            InnerButton gui = new InnerButton();
            gui.go();
        }
    
        public void go() {
            frame = new JFrame();
            ;
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b = new JButton("A");
            b.addActionListener();
            frame.getContentPane().add(BorderLayout.SOUTH, b);
            frame.setSize(200,100);
            frame.setVisible(true);
        }
    
        class BListener extends ActionListener {
            public void actionPerformed(ActionEvent actionEvent) {
                if (b.getText().equals("A")) {
                    b.setText("B");
                } else {
                    b.setText("A");
                }
            }
        }
    }