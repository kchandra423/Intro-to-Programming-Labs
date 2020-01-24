import java.util.Scanner;

public class Stars {
   Scanner kboard = new Scanner(System.in);

   public void rxc() {

       System.out.println("Enter the number of rows you want");
       int r = kboard.nextInt();
       System.out.println("Enter the number of columns you want");
       int c = kboard.nextInt();
       int a = c;
       int b = 1;
       while (r > 0) {
           r--;
           if (b != 1) {
               System.out.println();
           }
           b--;
           while (c > 0) {
               c--;
               System.out.print("* ");
           }
           c = a;
       }
       System.out.println("");
   }

   public void sqr() {
       System.out.println("Enter the size of your square in rows");
       int n = kboard.nextInt();
       int a = n;
       int c=n;

       while (n > 0) {
           n--;
           while (a > 0) {
               a--;
               System.out.print("*");
           }
           System.out.print("\n");
           a = c;
       }
       System.out.println("");
   }
   public void tri() {
       System.out.println("Enter the height of your Triangle in rows");
       int n = kboard.nextInt();
       int a=0;


       while (n > 0) {
           n--;
           a++;
           int c=a;
           while(c>0){
               System.out.print("*");
               c--;
           }
           System.out.print("\n");
       }
       System.out.println("");
   }
   public void itri() {
       System.out.println("Enter the height of your Inverted Triangle in rows");
       int rows = kboard.nextInt();
       int stars=1;
       int totalStars=1;
       int totalSpace = rows;
       int spaces;

       while (rows > 0) {
           rows--;
           totalStars++;
           spaces=totalSpace-stars;
           while(spaces>0){
               System.out.print(" ");
               spaces--;
           }

           while (stars>0){
               System.out.print("*");
               stars--;
           }
           stars=totalStars;
           System.out.print("\n");
       }
       System.out.println("");
   }
   public void pyr(){
       System.out.println("Enter the height of your Pyramid in rows");
       int totalRows = kboard.nextInt();
       int currentRow=1;
       int stars=1;
       int spaces;
       int lastStars= 1;

       while(currentRow<=totalRows){


           spaces=totalRows-currentRow;
           while(spaces>0){
               System.out.print(" ");
               spaces--;
           }
           lastStars=stars;
           while(stars>0){
               System.out.print("*");
               stars--;
           }

           stars=lastStars+2;


           System.out.print("\n");
           currentRow++;
       }
       System.out.println("");
   }
   public void dim(){
       System.out.println("Enter the number of rows in your diamond");
       int totalRows = kboard.nextInt();
       int currentRow=1;
       int maxRow = (int)(totalRows/2) +1;
       int stars=1;
       int spaces=0;
       int lastStars;

       while(currentRow<=totalRows){

           if(totalRows%2==1) {
               if (currentRow <= maxRow) {
                   spaces = totalRows - currentRow;
               } else {
                   spaces =  currentRow-1;
               }
           }
           if(totalRows%2==0) {
               if (currentRow < maxRow) {
                   spaces = totalRows - (currentRow+1);
               }
               else if(currentRow==maxRow){
                   spaces = totalRows - (currentRow);
               }
               else {
                   spaces =  currentRow-2;
               }
           }
           while(spaces>0){
               System.out.print(" ");
               spaces--;
           }


           lastStars=stars;
           while(stars>0){
               System.out.print("*");
               stars--;
           }
           if(totalRows%2==1) {
               if (currentRow < maxRow) {
                   stars=lastStars+2;
               } else {
                   stars=lastStars-2;
               }
           }
           else {
               if (currentRow < (maxRow-1)) {
                   stars = lastStars + 2;
               } else if (currentRow == (maxRow - 1)) {
                   stars = lastStars;
               } else {
                   stars = lastStars - 2;
               }
           }

           System.out.print("\n");

           currentRow++;

       }
       System.out.println("");
   }
   public void bW(){
       System.out.println("Enter the number of rows in your black widow symbol");
       int totalRows = kboard.nextInt();
       int currentRow=1;
       int maxRow = (int)(totalRows/2) +1;
       int stars=totalRows;
       int spaces=0;
       int lastStars;

       while(currentRow<=totalRows){

           if(totalRows%2==1) {
               if (currentRow <= maxRow) {
                   spaces = currentRow;
               } else {
                   spaces = totalRows-currentRow+1 ;
               }
           }
           else {
               if (currentRow < maxRow) {
                   //spaces = totalRows - (currentRow+1);
                   spaces = currentRow;
               }
               else {
                   spaces = totalRows-currentRow+1;
               }

           }
           while(spaces>0){
               System.out.print(" ");
               spaces--;
           }


           lastStars=stars;
           while(stars>0){
               System.out.print("*");
               stars--;
           }
           if(totalRows%2==1) {
               if (currentRow < maxRow) {
                   stars=totalRows-(2*currentRow);
               } else {
                   stars=lastStars+2;
               }
           }
           else {
               if (currentRow < (maxRow-1)) {
                   stars = lastStars - 2;
               } else if (currentRow == (maxRow - 1)) {
                   stars = lastStars;
               } else {
                   stars = lastStars + 2;
               }
           }

           System.out.print("*");
           System.out.print("\n");

           currentRow++;

       }
       System.out.println("");
   }
   public void fib(){
     int lastNum1 =0, lastNum2=1, thisNum=1;
    System.out.println("Enter what number of the sequence you want");
    int point=kboard.nextInt();
    while(point>1){
      thisNum=lastNum1+lastNum2;
      lastNum1=lastNum2;
      lastNum2=thisNum;
      point--;
    }
    System.out.print("\n");
    System.out.println("Your number is "+thisNum);
    System.out.print("\n");
   }
}