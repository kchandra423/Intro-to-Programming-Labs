/**
 * 
 */

/**
 * @author Kumar Chandra
 *Date: 9/17/19
 *Revision:01
 *Notes: Program to print Hello World y number of times, with the you being able to choose what y is.
 *R&D: You can choose how many times you print hello world, and hello world is now stored as a string.
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;//declare y
		y=69;//set how many times you will print hello world
		String x;
		x = "Hello, World!";//hello world as a string
		//System.out.println("Hello, World!");
		while (y>0) {
		System.out.println(x);//prints hello world y number of times
		y = y-1;
	}

}
}