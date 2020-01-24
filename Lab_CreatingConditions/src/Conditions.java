/*
	This is the Conditions class template. Use this class to 
	create methods that return the results of tests described in the
	lab description!

	Author:
	Date:
	Rev:
	Notes:
	
*/

import java.util.Scanner;

public class Conditions
{
  // No fields

  // This is an example method that tests the parameters in some way,
  // then returns the result of the test
  public boolean exampleTestMethod (int x, int y)
  {

  	boolean result = false;

  	// Complete your if statement (or series of if statements) here
  	// if ...

  	return result;
  }
  public boolean isPointInRectangle(int x, int y, int rectX, int rectY, int rectWidth, int rectHeight)
  {
	  boolean result = false;
	  if(x>=rectX && x <(rectX+rectWidth)&&x>=rectY &&  y<(rectY+rectHeight) )
	  {
		  result=true;
	  }
	  
	  return result;
  }
  public boolean isPointNotInRectangle(int x, int y, int rectX, int rectY, int rectWidth, int rectHeight)
  {
	  boolean result = true;
	  if(x>=rectX && x <(rectX+rectWidth)&&x>=rectY &&  y<(rectY+rectHeight) )
	  {
		  result=false;
	  }
	  
	  return result;
  }
  
  public boolean isLeapYear(int year)
  {
	  boolean result = false;
	  if(year%4==0 && (year%100!= 0 ||year%400==0)) {
		  result =true;
	  }
	  return result;
	
  }
  public boolean hasTwoEndingZeros(int x)
  {
	  boolean result = false;
	  if((x%100==0)&&(x%1000!=0)) {
		  result = true;
	  }
	  return result;
	
  }
  public boolean isLater(int month1, int day1, int
		  year1, int month2, int day2, int year2)
  {
	  boolean result = false;
	  if (year1>year2)
	  {
		  result=true;
	  }
	  else if((month1>month2)&&(year1>=year2))
	  {
		  result=true;
	  }
	  else if((month1>=month2)&&(year1>=year2)&&(day1>day2))
	  {
		  result=true;
	  }
	  return result;
  }
  public double getOrderTotal (int bp, int nb)
  {
	  double total=0;
	  if (bp+nb<=2)
	  {
		  total = 18.95*bp + 21.95*nb;
	  }
	  else if (bp==1&&nb==1)
	  {
		  total= 37.95;
	  }
	  else if (bp+nb>=3)
	  {
		  total = 15.95*(nb+bp);
	  }
	  else if (bp+nb>12)
	  {
		  total = 14*(bp+nb);
	  }
	  return total;
  }
  // Add methods for the additional conditions below



}
