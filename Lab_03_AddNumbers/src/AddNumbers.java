import java.util.Scanner;

/**
 * 
 */

/**
 *  @author Kumar Chandra
 *Date: 9/23/19
 *Revision:01
 *Notes: Program to add two numbers given by the user
 *R&D: now takes user input 
 */
public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		/*x=1;
		y=10;
		z=x+y;
		*/
		Scanner hi;
		hi= new Scanner(System.in);
		System.out.println("Enter an Integer");
		x=hi.nextInt();//get first number
		System.out.println("Enter an Integer");
		y=hi.nextInt();//get second number
		System.out.println();
		z=x+y;//calculate sum
		System.out.println("The first number is: "+x);//print results

		System.out.println("The second number is: "+y);//print results
	
		System.out.println("The sum is: "+z);//print results
		

	}

}
