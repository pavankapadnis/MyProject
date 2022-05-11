package Com.ObjectReffernce;

public class ObjectRefference {
	
	public void m1() {
		
		System.out.println("This is M1 Method");
	}
	
	public static void main(String[] args) {
		
		ObjectRefference ob = new ObjectRefference();
		
		//Here we create that type of Object.
		//but we cannot call any method present in that calss using of this object.
		
		Object ob1 = ob;
		
		// Here we can Create that type of object which return type is ClassName.
		//And we can also call any method which present in that Class.
		
		ObjectRefference ob2 = ob;
		ob2.m1();
	}
}
