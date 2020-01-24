
/**
 * 
 * Author:  Kumar Chandra
 * Date:    10/17/2019
 * Rev:     01
 * Notes:   Draws shoes from the foot class using the coordinate system class
 * R&D:     Uses a different shoe to make the second pattern
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.util.Scanner;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel {
	private Image shoe;
	Scanner x = new Scanner(System.in);
	int hi = x.nextInt();

	// Constructor
	public FootTest() {
		shoe = (new ImageIcon("leftshoe1.gif")).getImage();
		/*
		 * shoe.getScaledInstance (100, 45, Image.SCALE_DEFAULT);
		 */
	}

	// Called automatically when the panel needs repainting
	public static void main(String[] args) {
		JFrame window = new JFrame("Feet");
		window.setBounds(50, 50, 1500, 1500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("Press 1 for pattern 1 or 2 for pattern 2");
		FootTest panel = new FootTest();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int x = 1000;
		int y = 250;
		int stepLength = 45;

		Foot foot = new Foot(x, y, shoe);
		//do this if the scanner receives a 2
		if (hi == 2) {
			foot.draw(g);

			for (int count = 1; count <= 4; count++) {

				foot.moveForward(stepLength);
				foot.moveSideways(75);

				foot.turn(90);
				foot.draw(g);

			}
		}
		//do this if the scanner receives a 1
		if (hi == 1) {
			foot.turn(270);
			for (int count = 1; count <= 5; count++) {

				foot.draw(g);

				foot.moveSideways(100);

			}
		}
		// Draw a cursor at the expected center of the first "shoe":
		g.drawLine(x - 50, y, x + 50, y);
		g.drawLine(x, y - 50, x, y + 50);
	}

}