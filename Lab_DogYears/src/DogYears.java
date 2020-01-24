/**
 * @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72

 *
 * @author
 * @version
 */

import java.util.Scanner;

public class DogYears {

    public int convertToDogYears(int dog) {
    	int humanYears = (int)((5.367*dog+7.34483)+0.5);
    	if (humanYears == 23)
    		humanYears = 24;
    	return humanYears;
    }


    public int convertToHumanYears(int human) {
    	int dogYears = (int)(((human-7.34483)/5.367)+0.5);
    	
    	return dogYears;
    }
   

	public static void main (String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		String x;
		DogYears converter = new DogYears();
		
		System.out.println("Convert to dog years or human years?(Dog/Human)");
		x= keyboard.next();
		boolean input = true;
		//while (input) {
		if (x.equalsIgnoreCase("Human"))
		{
			System.out.println("Enter number of dog years");
			int dog = keyboard.nextInt();
			int human = converter.convertToHumanYears(dog);
			System.out.println("The number of human years is: "+human);
			input = false;
		}
		if (x.equalsIgnoreCase("Dog"))
		{
			System.out.println("Enter number of human years");
			int human = keyboard.nextInt();
			int dog = converter.convertToDogYears(human);
			System.out.println("The number of dog years is: " + dog);
			input = false;
		}
		else if(input==true){
			System.out.println("Please rerun and enter a correct input");
			
		}
		//}
		
	}

}

