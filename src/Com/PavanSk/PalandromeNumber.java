package Com.PavanSk;

import java.util.Scanner;

public class PalandromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, a, b, c, k;

		for (int j = 0; j <= 10; j++) {
			a = 0;
			b = 0;
			c = 0;
			System.out.println("Enter The Number");
			i = sc.nextInt();
			k = i;
			while (i > 0) {
				a = i % 10;
				c = (c + a) * 10;//
				i = i / 10;
			}
			b = c / 10;
			if (b == k) {
				System.out.println(k + " Is palindrome Number");
			} else {
				System.out.println(k + " Is Not palindrome Number");
			}
			// System.out.println(c / 10);
		}
	}

}
