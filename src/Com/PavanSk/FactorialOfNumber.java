package Com.PavanSk;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, temp;

		for (j = 0; j < 10; j++) {
			System.out.println("Enter The Number");
			int num = sc.nextInt();

			temp = num;
			for (i = num - 1; i > 0; i--) {
				num = num * i;
			}
			System.out.println("Factorail of " + temp + " Is " + num);
		}

	}
}
