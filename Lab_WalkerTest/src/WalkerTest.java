/**
 * 
 * Author:  Kumar Chandra
 * Date:    10/20/2019
 * Rev:     01
 * Notes:   Draws a walker from the walker class doing things
 * R&D:     Can now choose between one of three patterns.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.util.Scanner;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel {
	private Image leftShoe, rightShoe;
	private Walker walker,walker2;
	
	Scanner x = new Scanner(System.in);
	int hi = x.nextInt();
	
	// Constructor
	public WalkerTest() {
		leftShoe = (new ImageIcon("leftshoe1.gif")).getImage();
		rightShoe = (new ImageIcon("rightshoe.gif")).getImage();
		/*
		 * shoe.getScaledInstance (100, 45, Image.SCALE_DEFAULT);
		 */
		walker = new Walker(100,200,leftShoe,rightShoe);
		walker2 = new Walker(100,400,leftShoe,rightShoe);
	}
	
	// Called automatically when the panel needs repainting
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Feet");
		window.setBounds(50, 50, 1500, 1500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("Press 1 for pattern 1 or 2 for pattern 2 or 3 for pattern 3");
		WalkerTest panel = new WalkerTest();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//int x = 60;
		//int y = 70;


		
	
	
		//do this if the scanner receives a 2
		if (hi == 2) {
			walker.draw(g);
			for(int i=1; i <=1; i++)	{
				walker.firstStep();
				walker.draw(g);
				walker.stop();
				walker.draw(g);
				
			}
			walker.firstStep();
			walker.stop();
			walker.firstStep();
			walker.stop();
			walker.draw(g);
			

			
		}
		//do this if the scanner receives a 1
		if (hi == 1) {
			walker.draw(g);
			for(int i=1; i <=3; i++)	{
				walker.firstStep();
				walker.draw(g);
				walker.stop();
				walker.draw(g);
				
			}
		}
			if (hi == 3) {
				walker.draw(g);
				for(int i=1; i <=3; i++)	{
					walker.firstStep();
					walker.draw(g);
					walker.stop();
					walker.draw(g);
					
					
				}
				walker2.draw(g);
				for(int i=1; i <=1; i++)	{
					walker2.firstStep();
					walker2.draw(g);
					walker2.stop();
					walker2.draw(g);
					
				}
				walker2.firstStep();
				walker2.stop();
				walker2.firstStep();
				walker2.stop();
				walker2.draw(g);
				
		}
		
		// Draw a cursor at the expected center of the first "shoe":
		
	}
	
	}
/*
What is a WalkerTest?

A walkerTest is a class that runs a program using three other classes


What does WalkerTest have?

A walker test has a walker, two shoes, a scanner, and an integer.


What does WalkerTest do?

WalkerTest draws things, such as a walker.


If you had to create a new class that represented a sequence of dance steps 
for a human with two feet (a bi-ped), would you prefer to use Foot class or 
Walker class to do so? Why? Which class would result in less code statements for a dance steps program?

I would rather use walker since I wouldn't have to keep drawing feet over and over again, but I could rather
 just draw a walker and ask it to do certain things repeatedly in for/while loops. A Walker would use less code.
*/