package Com.PavanSk;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int l, m, p;

			System.out.println("Ener a String Here");

			Scanner sc = new Scanner(System.in);

			String str = new String(sc.nextLine());

			String stra[] = str.split(" ");

			

			for (int m1 = 0; m1 < stra.length - 1; m1++) {
				for (int j = m1; j < stra.length; j++) {
					if (stra[m1].compareTo(stra[j]) > 0) {
						String temp;
						temp = stra[m1];
						stra[m1] = stra[j];
						stra[j] = temp;
					}
				}
			}

			for (String w : stra) {
				System.out.print(w + " ");
			}

			System.out.println();

			System.out.println("Smalles word in given string is " + stra[0]);

			System.out.println("Greatest word in given string is " + stra[stra.length - 1]);
		}
	}
}
