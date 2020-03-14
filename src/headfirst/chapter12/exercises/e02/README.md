**Pool puzzle**

Fill in the gaps in the code using the given pool of code pieces.
Each piece of code can be used several times.
Not all of them will be used.

Your goal is to make a class that will compile, run
and result in an amazing shrinking blue rectangle on a white field.

    import javax.swing.*;
    import java.awt.*;
    
    public class Animate {
        int x = 1;
        int y = 1;
    
        public static void main(String[] args) {
            Animate gui = new Animate();
            gui.go();
        }
    
        public void go() {
            JFrame _____ = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ______________________________
            _____.getContentPane().add(drawP);
            ________________________
            _____.setVisible(true);
            for (int i = 0; i < 124; _____________) {
                ___;
                _______________;
                try {
                    Thread.sleep(50);
                } catch (Exception ex) { }
            }
        }
    
        class MyDrawP extends JPanel {
            protected void paintComponent(Graphics _) {
                _______________________;
                __________________________;
                ______________________;
                __________________________________________;
            }
        }
    }

**Pool**
    
    x++
    y++
<!-- -->
    g.setColor(blue)
    g.setColor(white)
    g.setColor(Color.blue);
    g.setColor(Color.white);
<!-- -->
    g.fillRect(x, y, x - 500, y - 250)
    g.fillRect(x, y, 500 - x * 2, 250 - y * 2)
    g.fillRect(500 - x * 2, 250 - y * 2, x, y)
    g.fillRect(0, 0, 250, 500)
    g.fillRect(0, 0, 500, 250)
<!-- -->
    g
    draw
    frame
    panel
<!-- -->
    drawP.paint()
    draw.repaint()
    drawP.repaint()
<!-- -->
    i++
    i++, y++
    i++, y++, x++
<!-- -->
    Animate frame = new Animate()
    MyDrawP drawP = new MyDrawP()
    ContentPane drawP = new ContentPane()
<!-- -->
    drawP.setSize(500, 270)
    frame.setSize(500, 270)
    panel.setSize(500, 270)