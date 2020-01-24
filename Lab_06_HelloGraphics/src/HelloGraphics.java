
//  This program shows simple graphics in a window.

import java.awt.*;
import javax.swing.*;

public class HelloGraphics extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //  to paint the background
    int xCenter=getWidth()/2;
    int yCenter=getHeight()/2;
    
    
    g.setColor(Color.BLUE);

    // Draw a 150 by 45 rectangle with the upper-left
    // corner at x = 20, y = 40:
    g.fillRect(xCenter-75, yCenter-23, 150, 45);

    g.setColor(Color.WHITE);

    // Draw a string of text starting at x = 55, y = 65:
    g.drawString("Hi Mr.Burroughs", xCenter-50, yCenter);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("I Changed IT");
    // Set this window's location and size:
    // upper-left corner at 300, 300; width 200, height 150
    window.setBounds(300, 300, 240, 250);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    HelloGraphics panel = new HelloGraphics();
    panel.setBackground(Color.DARK_GRAY);  // the default color is light gray
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}


