public class HelloKitty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloKitty  meow = new HelloKitty ();
		
		//meow.forLoop(5);
		meow.whileLoop(5);
		// meow.doWhileLoop(5);
	}

	// Method with sample for loop
	public void forLoop (int numberOfKitties)
	{
		// initialization:  int i = 0
		// condition:       i < numberOfKitties
		// change:          i++
		for (int i =0; i<numberOfKitties;i++ )
		{
			// interation:  
			System.out.println("Hello Kitty #" + (i+1));
			
		}
	}
	
	// Method with sample while loop
	public void whileLoop (int numberOfKitties)
	{
		//initialization:  
		int i= 0;
		
		// condition:  
		while (i<5)
		{
			// iteration
			System.out.println("Hello Kitty #" + (i+1));
			
			// change:
			i++;
		}
	}
	
	// Method with sample do while loop
	public void doWhileLoop (int numberOfKitties)
	{
		// initialization:  
	int i =0;
		
		do 
		{
			// iteration
			
			System.out.println("Hello Kitty #" + (i+1));
			// change: 
			i++;
			
		// condition:  i < numberOfKitties
		} while (i<5);
	}
}
