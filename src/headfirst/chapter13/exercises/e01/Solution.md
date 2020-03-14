![](frame1.png)

    /* C */
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button):
----
![](frame2.png)

    /* D */
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(button);
    frame.getContentPane().add(BorderLayout.NORTH, buttonTwo):
    frame.getContentPane().add(BorderLayout.EAST, panel):
----
![](frame3.png)

    /* E */
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    frame.getContentPane().add(BorderLayout.SOUTH, panel):
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.NORTH, button):
----
![](frame4.png)

    /* A */
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    frame.getContentPane().add(BorderLayout.NORTH, panel):
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button):
----
![](frame6.png)

    /* B */
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button):
    frame.getContentPane().add(BorderLayout.EAST, panel):