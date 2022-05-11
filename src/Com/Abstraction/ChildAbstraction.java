package Com.Abstraction;

public class ChildAbstraction extends FirstAbstraction {
	
	static {
		System.out.println("This is child Static block\n");
	}

	@Override
	void m1() {
		System.out.println("This abstract menthod of Parent abstract class and implemented in child class\n");
		
	}
	
	public ChildAbstraction() {
		super();
		System.out.println("This is child class constructor and here we call the parent class constrctor using super keyword\n");
	}
	
	public static void main(String[] args) {
		ChildAbstraction ch = new ChildAbstraction();
		ch.m1();
		ch.newm1();
		
	}

}
