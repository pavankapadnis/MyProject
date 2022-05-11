package Com.Polymorphism;

import Com.PavanSk.Demo;

public class OverloadingMethod {

	private void Demo() {
		System.out.println("This Is First Method");
		System.out.println(" ");
	}

	private void Demo(int x, int y) {
		System.out.println("This Is Second Method ");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println(" ");
	}

	private void Demo(int x, byte z) {
		System.out.println("This Is Third Method ");
		System.out.println("X = " + x);
		System.out.println("Z = " + z);
		System.out.println(" ");
	}

	private void Demo(double m, boolean y) {
		System.out.println("This Is Fourth Method ");
		System.out.println("Double M = " + m);
		System.out.println("Boolean Y = " + y);
		System.out.println(" ");
	}

	private void Demo(String z, long n) {
		System.out.println("This Is Fifth Method ");
		System.out.println("String Z = " + z);
		System.out.println("Long N = " + n);
	}

	public static void main(String[] args) {
		OverloadingMethod ol = new OverloadingMethod();

		ol.Demo();
		ol.Demo(40, 50);
		ol.Demo(500, (byte) 10);
		ol.Demo(100.00, false);
		ol.Demo("Hello String", 50000);
	}
}
