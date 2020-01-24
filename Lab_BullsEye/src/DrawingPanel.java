import java.awt.*;



import javax.swing.*;

/**
 * 
 * Author:  Greg Burroughs
 * Date:    10/5/2019
 * Rev:     05 by Kumar Chandra
 * Notes:  Draws a Bulls Eye
 * R&D:     Continuously draws a BullsEye with different colors over and over again
 */

//public class SimpleWindow extends JPanel implements KeyListener
public class DrawingPanel extends JPanel {
	

	//Fields
	private BullsEye redCross;

	// Constructors
	
	// No args constructor
	// calls JPanel constructor
	// instantiates a RedCross object
	// sets the background color to WHITE
	public DrawingPanel() {
		super();
		redCross = new BullsEye();
		setBackground(Color.WHITE);
		
		
		
		//  defer drawing the red cross to a RedCross object
			
	}

	// Methods
	
	// Paint Component is called when the window is drawn initially and whenever the window is resized
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

		int width = getWidth();
		int height = getHeight();

		redCross.draw(g, width, height);
		repaint();

	}

	//
	// Instantiate the JFrame and set a few properties
	// Instantiate a DrawingPanel, set a few properties, and add it to the JFrame
	//
	public static void main(String[] args) {
		JFrame window = new JFrame("Red Cross");
		window.setBounds(300, 300, 218, 247);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingPanel panel = new DrawingPanel();
		//panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}
}
