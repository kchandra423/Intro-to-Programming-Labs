/**
 * 
 * Author:  Greg Burroughs
 * Date:    10/5/2019
 * Rev:     05 by Kumar Chandra
 * Notes:  Draws a Bulls Eye
 * R&D:     Continuously draws a BullsEye with different colors over and over again
 */
import java.awt.*;
import java.util.Random;
import java.util.Scanner;



public class BullsEye
{

	// Fields
	
	// Constructors
	public BullsEye() {
		
	}

	// Methods
	
	// Draws a red cross centered between (0, 0) and (xWidth, xHeight)
	public void draw (Graphics g, int xWidth, int yHeight)
	{
		Random rand = new Random();
		int y=rand.nextInt(10);
		int w=rand.nextInt(11);
		int z=rand.nextInt(11);
		if (y==w||w==z) {
			w=rand.nextInt(11);
		}
		
		

		
		
		
		
		//Scanner kboard= new Scanner(System.in);
		
		int xCenter = xWidth / 2;
	    int yCenter = yHeight / 2;
	    
	    
	    //int numberOfRings;
	    //numberOfRings = rand.nextInt();
	    //width=numberOfRings*50;
	    int width1=150;
	    int xRealCenter1 = xCenter-width1/2;
	    int yRealCenter1 = yCenter-width1/2;
	    int width2=100;
	    int xRealCenter2 = xCenter-width2/2;
	    int yRealCenter2 = yCenter-width2/2;
	    int width3=50;
	    int xRealCenter3 = xCenter-width3/2;
	    int yRealCenter3 = yCenter-width3/2;
	    if(y==0) {
	    g.setColor(Color.RED);
	    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
	    }
	    if(y==1) {
		    g.setColor(Color.GREEN);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==2) {
		    g.setColor(Color.BLUE);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==3) {
		    g.setColor(Color.MAGENTA);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==4) {
		    g.setColor(Color.CYAN);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==5) {
		    g.setColor(Color.YELLOW);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==6) {
		    g.setColor(Color.BLACK);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==7) {
		    g.setColor(Color.GRAY);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==8) {
		    g.setColor(Color.ORANGE);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(y==9) {
		    g.setColor(Color.PINK);
		    g.fillOval(xRealCenter1, yRealCenter1, width1, width1);
		    }
	    if(w==0) {
		    g.setColor(Color.RED);
		    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
		    }
		    if(w==1) {
			    g.setColor(Color.GREEN);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==2) {
			    g.setColor(Color.BLUE);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==3) {
			    g.setColor(Color.MAGENTA);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==4) {
			    g.setColor(Color.CYAN);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==5) {
			    g.setColor(Color.YELLOW);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==6) {
			    g.setColor(Color.BLACK);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==7) {
			    g.setColor(Color.GRAY);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==8) {
			    g.setColor(Color.ORANGE);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==9) {
			    g.setColor(Color.PINK);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(w==10){
			    g.setColor(Color.WHITE);
			    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
			    }
		    if(z==0) {
			    g.setColor(Color.RED);
			    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
			    }
			    if(z==1) {
				    g.setColor(Color.GREEN);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==2) {
				    g.setColor(Color.BLUE);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==3) {
				    g.setColor(Color.MAGENTA);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==4) {
				    g.setColor(Color.CYAN);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==5) {
				    g.setColor(Color.YELLOW);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==6) {
				    g.setColor(Color.BLACK);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==7) {
				    g.setColor(Color.GRAY);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==8) {
				    g.setColor(Color.ORANGE);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==9) {
				    g.setColor(Color.PINK);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
			    if(z==10){
				    g.setColor(Color.WHITE);
				    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);
				    }
		    
	    /*g.setColor(Color.WHITE);
	    g.fillOval(xRealCenter2, yRealCenter2, width2, width2);
	    g.setColor(Color.RED);
	    g.fillOval(xRealCenter3, yRealCenter3, width3, width3);*/
	}
	
}





