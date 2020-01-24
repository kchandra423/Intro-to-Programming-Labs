public class Stuff{
	public static void main (String[] args ) 
	{
		
	
	int x, y, z;
	x = 12;
	y = 8;
	z = 105;
	
	if (((x+20) % 4 == 0 || ( y >10)) && ((z - 10)<100)){
		 System.out.println("First expression is true");
	}
	
	if ((x+20) % 4 == 0 || ( y >10) && (z - 10) <100){
		 System.out.println("Second expression is true");
	}
	
	if (x+20 % 4 == 0 ||  y >10 && (z - 10) <100){
		 System.out.println("Third expression is true");
	}
	
	if (x+20 % 4 == 0 ||  y >10 && z - 10 <100){
		 System.out.println("Fourth expression is true");
	}
	
	if ((x+20) % 4 == 0 ||  y > 10 && (z - 10) <100){
		 System.out.println("Fifth expression is true");
	}
	
	if ((x+20) % 4 == 0 ||  y > 10 && z - 10 <100){
		 System.out.println("Sixth expression is true");
	}
	}
}