package Com.Abstraction;

public abstract class FirstAbstraction {
	
	{
		System.out.println("This is abstact class Block\n");
	}
	
	static {
		System.out.println("This is Static Block of Abstract Class\n");
	}
	
	abstract void m1();
	
	public FirstAbstraction() {
		System.out.println("This is Abstract class constructor\n");
	}
	
	public void newm1() {
		System.out.println("This is newm1 Concrete method\n");
	}
	
}
