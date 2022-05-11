package Com.PavanSk;

import java.util.Scanner;

public class PowerOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, a, b, c, k;

		for (int j = 0; j <= 10; j++) {
			System.out.println("Enter The Number");
			a = sc.nextInt();
			System.out.println("Enter The Power");
			c = sc.nextInt();
			b = a;
			for (i = 1; i < c; i++) {
				a = a * b;
			}
			System.out.println(a);
		}
	}

}
