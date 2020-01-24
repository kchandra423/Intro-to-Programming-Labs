
// ________________________________________________

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Rainbow extends JPanel {
	// Declare skyColor:
	// ________________________________________________
	String x;

	public Rainbow() {
		setBackground(Color.CYAN);
		Scanner kboard = new Scanner(System.in);
		System.out.println("Do you want a traditional rainbow?");
		x = kboard.next();

	}

	// Draws the rainbow.
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int i = 8;
		int radius = 900;
		int xCenter = width / 2, yCenter = height / 2;
		int numberOfTimesRun = 0;
		if (x.equalsIgnoreCase("No")) {
			while (i > 0) {
				radius -= 100;
				Color c = new Color((int) (Math.random() * 255), (int) (Math.random() * 255),
						(int) (Math.random() * 255));
				g.setColor(c);
				g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
				i--;
			}
			g.setColor(Color.CYAN);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
		}

		if (x.equalsIgnoreCase("Yes")) {

			radius -= 100;
			g.setColor(Color.red);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.orange);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.yellow);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.green);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.blue);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.MAGENTA);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);
			radius -= 100;
			g.setColor(Color.CYAN);
			g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);

			/*
			 * radius-=100; Color c; if (i==8) { c = Color.red; } if (i==7) { c =
			 * Color.orange; } if (i==6) { c = Color.yellow; } if (i==5) { c = Color.cyan; }
			 * if (i==4) { c = Color.blue; } if (i==3) { c = Color.magenta; } else { c =
			 * Color.red; }
			 * 
			 * 
			 */

		}

		/*
		 * else { g.setColor(Color.RED);
		 * 
		 * Font font = new Font("Verdana", Font.BOLD, 200); g.setFont(font);
		 * g.drawString("Y R U BAD?", 10, 300); }
		 */

		// Calculate the radius of the innermost (sky-color) semicircle
		// so that the width of the middle (green) ring is the
		// arithmetic mean of the widths of the red and magenta rings:
		// ________________________________________________

		// Draw the sky-color semicircle:
		// ________________________________________________
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(xCenter + 20, yCenter - 50, 200, 100);
		g.fillOval(xCenter + 125, yCenter - 90, 200, 100);
		// g.fillOval(xCenter+125, yCenter, 200, 100);
		g.fillOval(xCenter + 220, yCenter - 50, 200, 100);
		g.fillOval(xCenter - (20 + 200), yCenter - 50, 200, 100);
		g.fillOval(xCenter - (125 + 200), yCenter - 90, 200, 100);
		// g.fillOval(xCenter-(125+radius), yCenter, 200, 100);
		g.fillOval(xCenter - (220 + 200), yCenter - 50, 200, 100);

	}

	public static void main(String[] args) {
		JFrame w = new JFrame("Rainbow");
		w.setBounds(30, 30, 1800, 900);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Rainbow());
		w.setVisible(true);
	}
}
