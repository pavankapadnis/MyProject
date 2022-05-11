package Com.ExceptionHandling;

public class TryNestedTryCatch {

	public static void main(String[] args) {
		
		//Here we Try Nested Try, Catch And finally block. And its Run Successfull. 
		
		try { //This is outer Try Block.
			int[] x = { 10, 20, 30, 40, 50 };
			System.out.println(x[5]);
		} 
		
		
		catch (ArrayIndexOutOfBoundsException e) { // This is Outer Catch Block.
			
			//This Is Inner Try Block.
			
			try { //This is Inner Try Block.
				int[] x = { 10, 20, 30, 40, 50 };
				System.out.println(x[5]);
			} 
			
			catch (ArrayIndexOutOfBoundsException f) { //This is Inner Catch Block.
				System.out.println("This is Inner Catch Block\n");
			} 
			
			finally { //This is Inner Finally Block.

				System.out.println("This is Inner Finally Block\n");
			}

			System.out.println("This is Outer Catch Block\n");
		} 
		finally { //This is Outer Finally Block.

			System.out.println("This is Outer Finally Block\n");
		}
	}

}
