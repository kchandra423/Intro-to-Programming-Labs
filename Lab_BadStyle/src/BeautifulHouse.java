/** 
 * Author:  Greg Burroughs
 * Date:    10/30/2019
 * Rev:     03 by Kumar Chandra
 * Notes:  	Draws a house
 * R&D:     n/a
 */

import java.awt.*;
import javax.swing.*;

public class BeautifulHouse extends JPanel {
	public void paintComponent(Graphics GRAPHICS) {
		super.paintComponent(GRAPHICS);
		
		//make a green rectangle
		GRAPHICS.setColor(Color.GREEN);
		GRAPHICS.fillRect(120, 20, 17, 40);
		
		//make a red rectangle
		GRAPHICS.setColor(Color.RED);
		GRAPHICS.fillRect(30, 40, 130, 45);
		
		//make a blue polygon(triangle)
		GRAPHICS.setColor(Color.BLUE);
		Polygon house = new Polygon();
		house.addPoint(30, 40);
		house.addPoint(160, 40);
		house.addPoint(95, 20);
		GRAPHICS.fillPolygon(house);
	}

	public static void main(String[] args) {
		//make a window
		JFrame window = new JFrame("Graphics Demo");
		window.setBounds(300, 300, 200, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//make a panel
		BeautifulHouse panel = new BeautifulHouse();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}
}
