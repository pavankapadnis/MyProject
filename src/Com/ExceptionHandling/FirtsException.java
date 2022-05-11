package Com.ExceptionHandling;

public class FirtsException {
	
	public void m1() {
		
	}
	
	public static void main(String[] args) {
		
		//Exception Handling is the most important concept in java.
		
		// We can write only Catch Block and Finally blocj to handle the exception.
		
		try{
			int[] x = {10,20,40,80,90,15,48}; 
			System.out.println(x[15]);
			System.err.println("Pavan");
		}
		
		// Catch block is compulsory to Catch the exception otherwise its throw the error.
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("This is Catch Block\n");
			
		}
		finally {
			System.out.println("This is finally block");
			//System.exit(-1);
		}
		System.out.println("Hello");
	}
	
}
