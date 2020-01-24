/**
 *  Author:  Greg Burroughs
 *  Date:    9/27/2019
 *  Rev:     02 by Kumar Chandra
 *  
 *  Notes:   Based on Skylit Question 2.13.a
 *           The RedCross class draws a red cross centered between (0, 0) and (xWidth, xHeight)
 *           
 *           R&D: Changes red cross size and shape as you move it 
 *           and prints the current height and width
 */
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class RedCross
{

	// Fields
	
	// Constructors
	public RedCross() {
		
	}

	// Methods
	
	// Draws a red cross centered between (0, 0) and (xWidth, xHeight)
	public void draw (Graphics g, int xWidth, int yHeight)
	{
		int xCenter = xWidth / 2;
	    int yCenter = yHeight / 2;
	    
		g.setColor(Color.BLACK);
	    g.drawString("Current Width:"+ xWidth, 10, 10);
	    g.drawString("Current Height:"+ yHeight, 10, 30);
	    g.setColor(Color.RED);
	    g.fillRect(xCenter-xWidth/4, yCenter-yHeight/12, xWidth/2, yHeight/6);
	    g.fillRect(xCenter-xWidth/12, yCenter-yHeight/4, yHeight/6, yHeight/2);
	}
	
}

