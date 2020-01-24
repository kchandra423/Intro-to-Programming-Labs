import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.*;
import java.awt.Graphics;

public class MovingDisk extends JPanel implements ActionListener
{
  private int time;
  public Disk disk;
  private Image logo;
  public int x;
  
  public MovingDisk()
  {
    time = 0;
    Timer clock = new Timer(30, this); 
    clock.start();
   
    logo = (new ImageIcon("owo.jpeg")).getImage();
   disk = new Disk(950,425,logo);
   disk.chooseDirection();
    
  }

  public void paintComponent(Graphics g)
  {
	super.paintComponent(g);
	setBackground(Color.BLACK);
    disk.checklocation();
    disk.draw(g);
    disk.move();
    disk.printWallTouch(g);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(1920,1000);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new MovingDisk());
    w.setResizable(false);
    w.setVisible(true);
  }
}
