package Com.PavanSk;

import java.util.Scanner;

public class SwitchCaseProg {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int r, rev, temp, i, num = sc.nextInt();// 45240
		// int y=sc.nextInt();
		rev = 0;
		temp = num;
		while (num > 0) {
			r = num % 10; // getting remainder
			rev = (rev * 10) + r;
			num = num / 10;
		}

		do {
			i = rev % 10;
			switch (i) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			rev = rev / 10;

		} while (rev > 0);

		// System.out.print(temp);
		if (temp % 10 == 0) {
			System.out.print("Zero ");
		}
		// 41, 52, 445, 778, 451, 890, 552, 956, 1224, 987
		// 5, 7, 13, 22, 10, 17, 12, 20, 9, 24

	}
}
