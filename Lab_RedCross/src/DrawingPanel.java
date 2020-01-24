import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;

/**
 * 
 * Author:  Greg Burroughs
 * Date:    9/27/2019
 * Rev:     02 by Kumar Chandra
 * Notes:   Based on Skylit Question 2.13.a
 *          Makes a "DrawingPanel" - JFrame containing a JPanel
 *          Has a RedCross object
 *          Calls the RedCross' draw() method to draw a RedCross centered in the JPanel whenever the window is resized 
 * R&D:     The size and shape of the cross changes as you change the shape of the window.
 *			Also prints the current height and width of the window.
 */

//public class SimpleWindow extends JPanel implements KeyListener
public class DrawingPanel extends JPanel {
	

	//Fields
	private RedCross redCross;

	// Constructors
	
	// No args constructor
	// calls JPanel constructor
	// instantiates a RedCross object
	// sets the background color to WHITE
	public DrawingPanel() {
		super();
		redCross = new RedCross();
		setBackground(Color.WHITE);
	}

	// Methods
	
	// Paint Component is called when the window is drawn initially and whenever the window is resized
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

		int width = getWidth();
		int height = getHeight();

		//  defer drawing the red cross to a RedCross object
		redCross.draw(g,width, height);
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