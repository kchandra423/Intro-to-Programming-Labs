
import java.util.Scanner;


public class IntroLoops {


	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		System.out.println("---MENU---");
		System.out.println("What would you like to see?");
		System.out.println("1) Division");
		System.out.println("2) Exercise 1");
		System.out.println("3) Exercise 2");
		System.out.println("4) Exercise 3");
		System.out.print("-----> ");
		String menuChoice = kboard.next();

	if (menuChoice.equalsIgnoreCase("1")) {
		System.out.println("Select your dividend");
		int dividend= kboard.nextInt();
		System.out.println("Select your divisor");
		int divisor= kboard.nextInt();	
		divide( dividend, divisor);
	}

	 else if (menuChoice.equalsIgnoreCase("2")) {
		 System.out.println("Select your first int");
			int num1= kboard.nextInt();
			System.out.println("Select your second int");
			int num2= kboard.nextInt();	
			printSeries( num1, num2);
	}
	 else if (menuChoice.equalsIgnoreCase("3")) {
		 System.out.println("Select your word");
		 String word = kboard.next();
			repeatWord(word);
	 }
	 else if (menuChoice.equalsIgnoreCase("4")) {
		 System.out.println("Select your first word");
		 String word1 = kboard.next();
		 System.out.println("Select your second word");
		 String word2 = kboard.next();
			printIndexLine(word1,word2);
	 }
	
		else {
			System.out.println("Sorry I dont have that method");
		}
		

	}

	
	public static void divide(int m, int n) {
		
		int q=0, r;
		while (m>=n) {
			m-=n;
			q++;
		}
		r=m;
		System.out.println("The quotient is "+q+" and your remainder is "+r);
		
	}

	public static void printSeries(int start, int end) {
		System.out.println("This is your series");
		int x=0;
		while (end>=start) {
			
			System.out.println(start+x);
			x++;
			end--;
			
		}
		
		
	}

	public static void repeatWord(String word) {
		System.out.println();
		int x=word.length();
		while(x>0) {
			System.out.println(word);
			x--;
		}
	}
//Write a program that asks the user to enter two words. 
	//The program then prints out both words on one line. 
	//The words will be separated by enough dots so that the total line length is 30:
	public static void printIndexLine(String word1, String word2) {
		int x = 30-(word1.length()+word2.length());
		System.out.print(word1);	
		while(x>1){
			System.out.print(".");
			x--;
		}
		
		System.out.print(word2);
	}



}