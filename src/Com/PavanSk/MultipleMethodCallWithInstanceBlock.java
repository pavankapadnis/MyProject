package Com.PavanSk;

import java.util.Scanner;

public class MultipleMethodCallWithInstanceBlock {
	static int z;

	public void md1(int x, int y) {
		this.z = x + y;
		System.out.println("This Is md1 Method " + this.z);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, x, y, temp;
		x = 100;
		y = 100;
		for (j = 0; j < 1; j++) {
			System.out.println("Enter The Number ");
			int num = sc.nextInt();

			temp = num;
			for (i = num - 1; i > 0; i--) {
				num = num * i;
			}
			System.out.println("Factorail of " + temp + " Is " + num);
		}

		Demo m1 = new Demo();
		//m1.md4(x, y);

	}

	public void md2(int x, int y) {
		this.z = x + y;
		System.out.println("This Is md2 Method " + this.z);
		MultipleMethodCallWithInstanceBlock m1 = new MultipleMethodCallWithInstanceBlock();
		m1.md1(5, 5);

	}

	public void md3(int x, int y) {
		this.z = x + y;
		System.out.println("This Is md3 Method " + this.z);
		MultipleMethodCallWithInstanceBlock m1 = new MultipleMethodCallWithInstanceBlock();
		m1.md2(5, 25);

	}

	public void md4(int x, int y) {
		this.z = x + y;
		System.out.println("This Is md4 Method " + this.z);
		MultipleMethodCallWithInstanceBlock m1 = new MultipleMethodCallWithInstanceBlock();
		m1.md3(5, 45);

	}

	static {
		int x, y;
		x = 10;
		y = 15;
		z = x + y;
		System.out.println("This Is Static Method " + z);
		MultipleMethodCallWithInstanceBlock m1 = new MultipleMethodCallWithInstanceBlock();
		m1.md1(5, 45);

	}
}
