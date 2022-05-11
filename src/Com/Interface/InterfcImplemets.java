package Com.Interface;

import java.util.Scanner;

public class InterfcImplemets implements FirstInterface, SecondInterface {

	/*
	 * Here we achieved the multiple inheritance using the interface implements
	 * class here we inherite the FirstInterface And SecondInterface intefaces in a
	 * single child class whose name is InterfcImplemets. Thus we achieved the
	 * multiple inheritance in java only using the Interface.
	 */

	@Override
	public void m1(int x, int y) {
		int l = x - y;
		System.out.println("Implemets M1 Result is " + x + " - " + y + " = " + l + "\n");
	}

	@Override
	public void m2() {
		System.out.println("This is second interface Method \n");

	}

	@Override
	public int m2(int x, int y) {
		int m = x + y;
		return m;
	}

	@Override
	public String m4(String z) {
		String s = z;
		return s;
	}

	public static void main(String[] args) {

		InterfcImplemets in = new InterfcImplemets();
		in.m1(40, 20);
		int j = in.m2(40, 20);
		String st = in.m4("This is Interface String Implements Here\n");
		System.out.println("Implements M2 class Result is " + j + "\n");
		System.out.println(st + " \n");
		System.out.println("Please Enter The number \n");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		in.m6(y);
		in.m2();
	}

}
