//imports
import java.awt.*;
import java.util.Random;

public class Disk
{
	//picture of disk
	private Image picture;
	//coordinate system
	private CoordinateSystemMovingDisk coordinates;
	//rng
	Random rand = new Random();
	public int numberOfTimesWallHasBeenTouched;
	//current x location
	double xCord;
	//current y location
	double yCord;
    //current way its being translated
	double xtranslate;
	double ytranslate;
  // Constructor
  public Disk(int x, int y, Image pic)
  {
    picture = pic;
    coordinates = new CoordinateSystemMovingDisk(x, y, pic);
    xCord = x;
    yCord = y;
    
  }
  public void chooseDirection()
  {
	  xtranslate = rand.nextDouble();
	  xtranslate*=10;
	  ytranslate = java.lang.Math.sqrt(100-(xtranslate*xtranslate));
	  Boolean y = rand.nextBoolean();
	  if (y==true)
	  {
		  xtranslate *=-1;
	  }
	  y=rand.nextBoolean();
	  if (y==true)
	  {
		  ytranslate *=-1;
	  }
	  
	  
  }
 public void calculateDistanceTraveled()
 {
	 double x= xtranslate + ytranslate;
	 System.out.println(x);
 }
  public void move()
  {
	  coordinates.shift(xtranslate, ytranslate);
	  xCord+=xtranslate;
	  yCord+=ytranslate;
  }
  
  public void printWallTouch(Graphics g)
  {
	 g.setColor(Color.WHITE);
	 Font font = new Font("Verdana", Font.BOLD, 20);
	 g.setFont(font);
	 g.drawString("Number of Bounces: "+ numberOfTimesWallHasBeenTouched, 10, 20);
  }
  public void checklocation()
  {
	  
		  if (xCord>=1850 || xCord<= 70)
		  {
		  xtranslate *=-1;
		  numberOfTimesWallHasBeenTouched ++;
		  }
	  
	  if (yCord <= 80 || yCord >= 945)
	  {
		  ytranslate *=-1;
		  numberOfTimesWallHasBeenTouched ++;
	  }
	  
  }
  
  public void draw(Graphics g)
  {
    coordinates.drawImage(g, picture);
  }
 
}


