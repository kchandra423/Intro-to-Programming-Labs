/**
 * 
 */

/**
 *  @author Kumar Chandra
 *Date: 9/23/19
 *Revision:01
 *Notes: Program to print 1 of two faces, depending on whether or not you input a positive or negative integer
 *R&D: You can now choose one of two faces
 */
public class PrintFace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=-5;//if the you put a positive integer, it will print the first face, but if you put a negative integer it will print the second face.
		if(x>0){
		System.out.println("   xxxxxxx");//printing face 1
		System.out.println("  x       x");
		System.out.println("((  0   0  ))");
		System.out.println("  |   ^   |");
		System.out.println("  |  ___  |");
		System.out.println("   -------");
	}
		if (x<0) {
			
			
			System.out.println("  |  |  ");//printing face 2
			System.out.println("________");
		}

}
}