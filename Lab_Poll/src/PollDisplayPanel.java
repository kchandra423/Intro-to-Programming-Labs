   // A PollDisplayPanel holds the vote counts and
// displays the numbers and the pie chart for
// the current vote counts.



import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel
{
  private String name1, name2, name3;
  // STEP 1: Declare the int fields count1, count2, count3:
  int  count1, count2, count3, total ;
  Random rand = new Random();
  Scanner kboard= new Scanner(System.in);
  
  // Constructor
  public PollDisplayPanel(String nm1, String nm2, String nm3)
  {
    setBackground(Color.WHITE);
    name1 = nm1;
    name2 = nm2;
    name3 = nm3;
    count1 = 0;   // optional
    count2 = 0;   // optional
    count3 = 0;   // optional
    total=0;
    System.out.println("Select probablity of russian interference out of 100");
    
  }
 
  // Increments count1
  public void vote1()
  {
    count1++;
  }

  // Increments count2
  public void vote2()
  {
    count2++;
  }

  // Increments count3
  public void vote3()
  {
    count3++;
  }

  // Returns a string representation of this object
  public String toString()
  {
  	 String x ,y ,z,a;
  	 x= "Tami: "+count1 ;
  	 y="     Brian: "+count2;
  	 z="		         Liz: " +count3;
  	 a= x+y+z;
	  // STEP 3: Complete the toString() method
  	// This method should return a String in the form:
  	// Tami: 1   Brian: 2   Liz: 0

    return a;
  }

  // Redefines JPanel's paintComponent to draw this pie chart
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int x = w/2;
    int y = h/2;
    int r = Math.min(w, h) / 4;
    
    
    
    if (total<=10)
    {
    	g.drawString("Total Votes: "+ total, 10, 10);
    	drawPieChart(g, x, y, r);
        drawLegend(g, x, y, r);
        
    }
    else
    {
    	chooseElection(g);
    }
    
  }

  // Draws the pie chart.
  // To avoid gaps in the picture, the following algorithm is used:
  // 1. set fromDegree to 0;
  // 2. draw the red sector and increment fromDegree by its size
  // 3. draw the green sector and increment fromDegree by its size
  // 4. set the size of the blue sector to the remaining
  //    area, 360 - fromDegree, but not less than 0:
  //      degrees = Math.max(360 - fromDegree, 0);
  //    (Occasionally, due to rounding errors, fromDegree may become 361,
  //    for example, count1 = 5, count2 = 11, count3 = 0.)
  private void drawPieChart(Graphics g, int x, int y, int r)
  {
    int total = count1 + count2 + count3;
    int fromDegree = 0;

    if (total > 0)
    {
      int degrees;
      g.setColor(Color.RED);
      degrees = countToDegrees(count1, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree+=degrees;
      
      g.setColor(Color.green);
      degrees = countToDegrees(count2, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree+=degrees;
      
      g.setColor(Color.blue);
      degrees = countToDegrees(count3, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree+=degrees;
      // STEP 5: Finish the drawPieChart() method so that it correctly
      // draws all 3 sectors of the pie chart.
    }
    else
    {
      g.setColor(Color.LIGHT_GRAY);
      drawSector(g, x, y, r, fromDegree, 360);
    }
  }

  // Draws the vote counts and the corresponding color squares.
  private void drawLegend(Graphics g, int x, int y, int r)
  {
    // Display the counts:
    y += (r + 20);
    g.setColor(Color.BLACK);

	// STEP 6: Finish the drawLegend() method by uncommenting and
	// completing the following three lines
	
    g.drawString( toString() , x - r, y);
/*
    g.drawString( ____________ , x, y);

    g.drawString( ____________ , x + r, y);
*/	

    // Display the color squares:
    y += 5;
    x -= 2;
    g.setColor(Color.RED);
    g.fillRect(x - r, y, 10, 10);
    g.setColor(Color.GREEN);
    g.fillRect(x, y, 10, 10);
    g.setColor(Color.BLUE);
    g.fillRect(x + r, y, 10, 10);
    total++;
  }

  // Returns the number of degrees in a pie slice that
  // corresponds to count / total, rounded to the nearest integer.
  private int countToDegrees(int count, int total)
  {
	// STEP 4: Complete the countToDegrees method so that it returns
	// the correct number of degrees
	  int x= (int)((((double) count/total)*360)+0.5);
	  
    return x;
  }

  public void  chooseElection(Graphics g)
  {
	  double x = kboard.nextInt()/100.0;
	 
	  if(rand.nextDouble()<=x)
	  {
		  g.setColor(Color.RED);
		  Font font = new Font("Raanana", Font.BOLD, 20);
		  g.setFont(font);
		  g.drawString("O vencedor é (The winner is):", 20, 30);
		  g.drawString("Vladimir Putin", 20, 50);
		  g.setColor(Color.BLUE);
		  g.fillRect(0, 100, 400, 100);
		  g.setColor(Color.RED);
		  g.fillRect(0, 200, 400, 100);

	  }
	  else if (count1> count2&& count1>count3)
	  {
		  g.setColor(Color.RED);
		  Font font = new Font("Papyrus", Font.BOLD, 20);
		  g.setFont(font);
		  g.drawString("The winner is: Tami", 20, 30);
	  }
	  else if (count2> count3&& count2>count1)
	  {
		  g.setColor(Color.GREEN);
		  Font font = new Font("Comic Sans MS", Font.BOLD, 20);
		  g.setFont(font);
		  g.drawString("The winner is: Brian", 20, 30);
	  }
	  else if (count3> count2&& count3>count1)
	  {
		  g.setColor(Color.blue);
		  Font font = new Font("Verdana", Font.BOLD, 20);
		  g.setFont(font);
		  g.drawString("The winner is: Liz", 20, 30);
	  }
  }
  // Draws a sector, centered at x, y, of radius r,
  // of angle measure degrees, starting at fromDegree.
  private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees)
  {
    if (degrees > 359)
      g.fillOval(x - r, y - r, 2 * r, 2 * r);
    else
      g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
  }
}


