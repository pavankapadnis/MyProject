package Com.Inheritance;

public class NewPracticeInheriteParent {

	/*
	 * This M1 Parent Class method we call in child class also override the M1 mehod
	 * in child class with extended features of child class its Amazing.
	 */

	public void m1() {
		int x, y, z, k;
		x = 20;
		y = 40;
		z = x + y;
		k = y - x;
		System.out.println("This is Parent class Method " + z + " " + k + "\n");
	}
}
