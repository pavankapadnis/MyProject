package Com.PavanSk;

import java.util.Scanner;

public class HalfDiamondStarPattern {
	public void Revan() {
		System.out.println("Hello Eclipse");
	}

	static void NewBorn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you have Print");
		int nm = sc.nextInt();

		int i, j, k;
		for (i = 0; i <= nm; i++) {
			for (j = nm; j > 0; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = nm - 1; i > 0; i--) {
			for (j = nm; j > i - 1; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * for(i=0; i<=nm;i++) { for(j=nm;j>i;j--) { System.out.print("*"); }
		 * System.out.println(); }
		 */
	}

	public static void main(String[] args) {
		System.out.println();
		HalfDiamondStarPattern l = new HalfDiamondStarPattern();
		l.Revan();
		NewBorn();
	}
}