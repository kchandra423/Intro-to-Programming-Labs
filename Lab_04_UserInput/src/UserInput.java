import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kumar Chandra Date: 9/23/19 Revision:01 Notes: Program to add or
 *         multiply two numbers based on user input R&D: You can now choose
 *         whether to do multiplication, addition, subtraction, or division.
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;// declare
		Scanner hi;
		String EE;
		hi = new Scanner(System.in);

		System.out.println("Enter an Integer");
		x = hi.nextInt();

		System.out.println(
				"Enter * for multiplaction or + for addition, - for subtraction, and / for division. If anything else is inputed, the program will end");// prompt
																																							// user
																																							// for
																																							// operator
		EE = hi.next();

		if (EE.equals("+")) {// do this if they choose addition

			System.out.println("Enter a Integer:");
			y = hi.nextInt();
			z = x + y;
			System.out.println("The sum is:" + z);
		}

		if (EE.equals("*")) {// do { this if they choose multiplication

			System.out.println("Enter a Integer: ");
			y = hi.nextInt();
			z = x * y;
			System.out.println("The product is:" + z);
		}
		if (EE.equals("/")) {// do { this if they choose division

			System.out.println("Enter a Integer: ");
			y = hi.nextInt();
			z = x / y;
			System.out.println("The dividend is:" + z);
		}
		if (EE.equals("-")) {// do this if they choose subtraction

			System.out.println("Enter a Integer: ");
			y = hi.nextInt();
			z = x - y;
			System.out.println("The difference is:" + z);
		}

	}
}
