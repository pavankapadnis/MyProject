package Com.Polymorphism;

public class OverrridingMethodChild extends OverrridingMethodParent {

	public void Demo(int x, int y) {
		System.out.println("This Is Child Method");
		System.out.println("Value Of x is = " + x);
		System.out.println("Value Of x is = " + y);
		System.out.println();

	}

	public static void main(String[] args) {
		OverrridingMethodChild ch = new OverrridingMethodChild();
		ch.Demo(100, 200);
		OverrridingMethodParent pr = new OverrridingMethodParent();
		pr.Demo(400, 500);
	}
}
