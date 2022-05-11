package Com.PavanSk;

import java.util.Scanner;

public class SmallestWordLargestWordString {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int l, m, p;

			System.out.println("Ener a String Here");

			Scanner sc = new Scanner(System.in);

			String str = new String(sc.nextLine());

			String stra[] = str.split(" ");

			System.out.println(stra.length);

			for (int j = 0; j < stra.length; j++) {
				for (int k = stra.length - 1; k > j; k--) {
					l = stra[j].codePointCount(0, stra[j].length());
					m = stra[k].codePointCount(0, stra[k].length());
					String n = "";
					if (l > m) {
						n += stra[j];
						stra[j] = stra[k];
						stra[k] = n;
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
