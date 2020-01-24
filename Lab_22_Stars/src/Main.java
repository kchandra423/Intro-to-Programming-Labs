import java.util.Scanner;

public class Main {



       public static void main (String[]args){
           System.out.println();
           Stars stars = new Stars();
           Scanner kboard = new Scanner(System.in);
           boolean loopCondition = true;
           while(loopCondition) {
               System.out.println("Which pattern would you like?");
               System.out.println("1) Rows and Columns");
               System.out.println("2) Square");
               System.out.println("3) Triangle");
               System.out.println("4) Inverted Triangle");
               System.out.println("5) Pyramid");
               System.out.println("6) Diamond");
               System.out.println("7) Black Widow Symbol");
               System.out.println("8) Fibonacci");
               System.out.println("9)Stop");
               String answer = kboard.next();
       if (answer.equalsIgnoreCase("1")||answer.equalsIgnoreCase("Rows and Columns")){
           stars.rxc();
       }
       else if (answer.equalsIgnoreCase("2")||answer.equalsIgnoreCase("Square")){
           stars.sqr();
       }
       else if (answer.equalsIgnoreCase("3")||answer.equalsIgnoreCase("Triangle")){
           stars.tri();
       }
       else if (answer.equalsIgnoreCase("4")||answer.equalsIgnoreCase("InvertedTriangle")){
           stars.itri();
       }
       else if (answer.equalsIgnoreCase("5")||answer.equalsIgnoreCase("Pyramid")){
           stars.pyr();
       }
       else if (answer.equalsIgnoreCase("6")||answer.equalsIgnoreCase("Diamond")) {
           stars.dim();
       }
       else if (answer.equalsIgnoreCase("7")||answer.equalsIgnoreCase("BlackWidow")) {
           stars.bW();
       }
       else if (answer.equalsIgnoreCase("8")||answer.equalsIgnoreCase("FIbonacci")) {
           stars.fib();
       }
       else if (answer.equalsIgnoreCase("9")||answer.equalsIgnoreCase("Stop")){
           loopCondition=false;
       }
       else {
           System.out.println("Sorry, I don't have that pattern\n");

       }
       }


       }
   }