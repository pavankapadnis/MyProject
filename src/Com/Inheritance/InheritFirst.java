package Com.Inheritance;

import java.util.Scanner;

public class InheritFirst extends InheriteParent {

	public void Demo2() {

		InheriteParent in = new InheriteParent();
		this.c = 40;
		this.v = 90;

		int x, y, z, m;
		x = 2;
		y = 8;
		z = x + y;
		m = x + y + z;
		System.out.println("This is Demo2 Method Addition of X , Y And Z is " + m);
	}

	public static void main(String[] args) {

		InheritFirst in = new InheritFirst();
		InheriteParent ip = new InheriteParent();
		in.Demo();
		in.Demo2();
		ip.Demo2();
		System.out.println("Value of C is " + in.c);
		System.out.println("Value of V is " + in.v);

		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}
		int N1 = sc.nextInt();
		if (N1 > 20 && N1 % 2 == 0) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}

		
		System.out.println("");
		String s = sc.nextLine();
		int i = sc.nextInt();

		double d = sc.nextDouble();
		

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
