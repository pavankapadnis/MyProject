package Com.ExceptionHandling;

public class MultipleThrow {
	
	public void m1() throws ArrayIndexOutOfBoundsException {
		int[] x = {10,20,30,40,50};
		System.out.println("Vlaue of Array X[1] is "+x[1]);
		String st = "Hello India";
		System.out.println("Character at 5th index is "+st.charAt(12));
	}
	
	public void m2() throws ArrayIndexOutOfBoundsException {
		m1();
	}
	
	public void m4() throws ArrayIndexOutOfBoundsException {
		m2();	
	}
	
	public void m5() throws ArrayIndexOutOfBoundsException {
		m4();
	}
	
	public static void main(String[] args) {
		
		MultipleThrow mt = new MultipleThrow();
		try {
			mt.m5();
		}
		
		//Here we write multiple catch block for different type of exception using one try block.
		
		//But make practice in one try block there is only one risky code.
		
		// Means for ArrayIndexOutOfBoundsException in one try block And.
		
		//StringIndexOutOfBoundsException is Another try block.
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Boundry. Please Enter Valid Index");
		}
		catch (StringIndexOutOfBoundsException e ) {
			System.out.println("String Out of Boundry. Please Enter Valid Index");
		}
		
	}

}
