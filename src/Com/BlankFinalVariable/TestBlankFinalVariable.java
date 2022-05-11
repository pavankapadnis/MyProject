package Com.BlankFinalVariable;

import java.util.TreeSet;

public class TestBlankFinalVariable {

	final int x, y; // Here Normally we cannot Define blank final variable

	/*
	 * But forcefully we define blank final variable we must assign initialize blank
	 * final variable in instance block OR In Constructor.
	 */

	{
		this.x = 10; // Here we initialize blank Final X Variable in Instance Block.
		this.y = 40; // Here we initialize blank Final X Variable in Instance Block.
		
		System.out.println("Value Of instance Blank Final Variable X is "+this.x+"\n");
		System.out.println("Value Of instance Blank Final Variable Y is "+this.y+"\n");
	}
	
	
	
	//Here Blank Final Variable Are Initialize in Constructor Also.
	
	//Either Constructor or Instance Only we initialize Blank Final Variable Not In Both.

	/*
	 * public TestBlankFinalVariable() {
	 * 
	 * this.x = 40; this.y = 90; }
	 */
	
	public static void main(String[] args) {
		
		TestBlankFinalVariable tf = new TestBlankFinalVariable();		
	}

}
