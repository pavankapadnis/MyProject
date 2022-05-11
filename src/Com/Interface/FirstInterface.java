package Com.Interface;

public interface FirstInterface {
	
	int i=4;
	
	/* @author : Pavan Kapadnis */
	
	void m1(int x, int y);
	
	static void m7() {
		/*
		 * Here we write static method in interface but we cannot write instruction in
		 * static method of interface but give the body of static method is compulsory.
		 */
	}
	
	int m2(int x, int y);
	
	String m4(String z);

	default void m6(int y) {
		int x = y;
		System.out.println("Default method implements ininterface "+x+"\n");
		
		/*
		 * Here we define the default class to make a full concrete class in interface.
		 * we add and write the the instruction and other operation in this class. and
		 * this class call in child class with the help of child class object.
		 */
	}

}
