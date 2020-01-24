import java.util.Scanner;


/**
 * Date: September, 23, 2019
 * 
 * @author Kumar Chandra 
 * Revisions: 03 
 * Notes: Program to print "Hello, World!" in one of three languages, a certain number of times 
 * R&D: Added Portugese and easier to choose how many times you want to print, and which language you choose.
 */
public class HelloWorldChoice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oyeayea;
		int x;
		String y;
		oyeayea = new Scanner(System.in);
		// System.out.println("Type an Integer:");
		System.out.println("Enter your language (Portugese, English, or Spanish)");
		y = oyeayea.next();
		System.out.println("Enter how many times you would like to print your text");
		x = oyeayea.nextInt();

		if (y.equals("English")) {// if x is greater than 3, print hello world and subtract one from x until x=0,
									// then exit the loop.
			while (x > 0) {
				System.out.println("Hello, World!");
				x = x - 1;
			}

		}

		if (y.equals("Spanish")) {// if x is greater than 3, print hello world and subtract one from x until x=0,
									// then exit the loop.
			while (x > 0) {
				System.out.println("Hola, Mundo!");
				x = x - 1;
			}
		}
		if (y.equals("Portugese")) {// if x is greater than 3, print hello world and subtract one from x until x=0,
									// then exit the loop.
			while (x > 0) {
				System.out.println("Olá Mundo");
				x = x - 1;
			}

			/*
			 * if(x==2) { System.out.println("Hello, World!");//when x is 2 it prints hello
			 * World(English)! } if(x==3) { System.out.println("Olá Mundo");//when x is 3 it
			 * prints Olá Mundo (portugese)! }
			 */

		}
	}
}
