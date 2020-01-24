
/*
   This is the ConditionTester template. Use this class to test simple boolean methods!

   Author:
   Date:
   Rev:
   Notes:
   
*/

import java.util.Scanner;

public class ConditionTester {

	public static void main(String[] args) {
		boolean loopCondition = true;
		Scanner kboard = new Scanner(System.in);
		String input;
		Conditions conditions = new Conditions();
		// menu loop to test methods

		// loop initlization

		// the loop itself
		while (loopCondition) {
			// loop Body
			// Ask for the name of a method
			// Read the name of the method
			// if - else chain to dispatch and check the method

			System.out.println("What Method do you want to check?");
			System.out.println("					1. IsPointInRectangle					4.HasTwoEndingZeros");
			System.out.println("					2. IsPointNotInRectangle				5.IsLater");
			System.out.println("					3. IsLeapYear							6.GetOrderTotal");
			input = kboard.next();
			if (input.equalsIgnoreCase("IsPointInRectangle") || input.equalsIgnoreCase("1")
					|| input.equalsIgnoreCase("one")) {

				int x, y, rectX, rectY, rectWidth, rectHeight;

				System.out.println("Enter your x value");
				x = kboard.nextInt();
				System.out.println("Enter your y value");
				y = kboard.nextInt();
				System.out.println("Enter your recatngle x value");
				rectX = kboard.nextInt();
				System.out.println("Enter your rectangle y value");
				rectY = kboard.nextInt();
				System.out.println("Enter your rectangle width");
				rectWidth = kboard.nextInt();
				System.out.println("Enter your rectangle height");
				rectHeight = kboard.nextInt();

				boolean result = conditions.isPointInRectangle(x, y, rectX, rectY, rectWidth, rectHeight);
				if (result) {
					System.out.println("The point is in the rectangle");
				} else {

					System.out.println("The point is not in the rectangle");

				}
			} else if (input.equalsIgnoreCase("IsPointNotInRectangle") || input.equalsIgnoreCase("2")
					|| input.equalsIgnoreCase("two")) {
				int x, y, rectX, rectY, rectWidth, rectHeight;
				System.out.println("Enter your x value");
				x = kboard.nextInt();
				System.out.println("Enter your y value");
				y = kboard.nextInt();
				System.out.println("Enter your recatngle x value");
				rectX = kboard.nextInt();
				System.out.println("Enter your rectangle y value");
				rectY = kboard.nextInt();
				System.out.println("Enter your rectangle width");
				rectWidth = kboard.nextInt();
				System.out.println("Enter your rectangle height");
				rectHeight = kboard.nextInt();
				boolean result = conditions.isPointNotInRectangle(x, y, rectX, rectY, rectWidth, rectHeight);
				if (result) {
					System.out.println("The point is not in the rectangle");
				} else {

					System.out.println("The point is in the rectangle");

				}
			} else if (input.equalsIgnoreCase("IsLeapYear") || input.equalsIgnoreCase("3")
					|| input.equalsIgnoreCase("three")) {
				int x;
				System.out.println("Enter the year");
				x = kboard.nextInt();

				boolean result = conditions.isLeapYear(x);
				if (result) {
					System.out.println("" + x + " is a leap year");
				} else {

					System.out.println("" + x + " is not a leap year");

				}
			} else if (input.equalsIgnoreCase("HasTwoEndingZeros") || input.equalsIgnoreCase("4")
					|| input.equalsIgnoreCase("four")) {
				int x;
				System.out.println("Enter your number");
				x = kboard.nextInt();

				boolean result = conditions.hasTwoEndingZeros(x);
				if (result) {
					System.out.println("" + x + " ends in two zeros");
				} else {

					System.out.println("" + x + " does not end in two zeros");

				}
			} else if (input.equalsIgnoreCase("IsLater") || input.equalsIgnoreCase("5")
					|| input.equalsIgnoreCase("five")) {
				int year1 = 1, year2 = 1, month1 = 1, month2 = 1, day1 = 1, day2 = 1;
				String x, y;
				boolean month1checker = true, year1checker = true, year2checker = true, month2checker = true,
						day1checker = true, day2checker = true;
				System.out.println("Enter your time period of the first date(BCE or CE)");
				x = kboard.next();
				System.out.println("Enter your time period of the second date(BCE or CE)");
				y = kboard.next();

				while (year1checker) {
					System.out.println("Enter the year of the first date");
					year1 = kboard.nextInt();
					if ((year1 < 0)) {
						System.out.println("Wait a minute...");

					} else {
						year1checker = false;
					}
				}
				while (month1checker) {
					System.out.println("Enter the month of the first date");
					month1 = kboard.nextInt();
					if ((month1 <= 0) || (month1 > 12)) {
						System.out.println("Wait a minute...");

					} else {
						month1checker = false;
					}
				}
				while (day1checker) {
					System.out.println("Enter the day of the first date");
					day1 = kboard.nextInt();
					if ((day1 <= 0) || (day1 >= 32)) {
						System.out.println("Wait a minute...");

					} else {
						day1checker = false;
					}
				}
				while (year2checker) {
					System.out.println("Enter the year of the second date");
					year2 = kboard.nextInt();
					if ((year2 < 0)) {
						System.out.println("Wait a minute...");

					} else {
						year2checker = false;
					}
				}
				while (month2checker) {
					System.out.println("Enter the month of the second date");
					month2 = kboard.nextInt();
					if ((month2 <= 0) || (month2 > 12)) {
						System.out.println("Wait a minute...");

					} else {
						month2checker = false;
					}
				}
				while (day2checker) {
					System.out.println("Enter the day of the second date");
					day2 = kboard.nextInt();
					if ((day2 <= 0) || (day2 >= 32)) {
						System.out.println("Wait a minute...");

					} else {
						day2checker = false;
					}
				}
				if (x.equalsIgnoreCase("BCE"))
				{
					year1*=-1;
					month1*=1;
					day1*=1;
			
					
				}
				if (y.equalsIgnoreCase("BCE"))
				{
					year2*=-1;
					month2*=-1;
					day1*=-1;
				}
				boolean result = conditions.isLater(month1, day1, year1, month2, day2, year2);
				if (result) {
					System.out.println("The first date is later than the second date");
				} else {

					System.out.println("The first date is not later than the second date");

				}
				
			} else if (input.equalsIgnoreCase("getOrderTOtal") || input.equalsIgnoreCase("6")
					|| input.equalsIgnoreCase("six")) {
				int x,y;
				System.out.println("Enter the number of \"Be Prepared TextBooks\"");
				
				}
			
			else if (input.equalsIgnoreCase("Stop")) {
				System.out.println("Goodbye");
				loopCondition = false;
			} else {
				System.out.println("Sorry, I don't have that method :(");
			}
			// Loop change

		}
	}
//  public static void main(String[ ] args)
//  {
//    Scanner kboard = new Scanner(System.in);
//
//    // Copy-Paste more of these lines if more input is necessary
//    System.out.print("Enter the first number --> ");
//    int num1 = kboard.nextInt( );
//
//    System.out.print("Enter the second number --> ");
//    int num2 = kboard.nextInt( );
//
//    // Change this code so that it calls your method.
//    Conditions myConditions = new Conditions();
//    boolean result = myConditions.exampleTestMethod(num1, num2);
//
//    // Printing out the result of the test!
//    System.out.println("The result of the test: " + result);
//
//  }

}