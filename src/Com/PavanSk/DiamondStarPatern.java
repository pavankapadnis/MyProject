package Com.PavanSk;

import java.util.Scanner;

public class DiamondStarPatern {
	
	public void Revan() {
		System.out.println("Hello Eclipse");
	}

	static void NewBorn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you have Print");
		int nm = sc.nextInt();

		int i, j, k;
		for (i = 0; i <= nm; i++) {
			for (j = nm; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = nm - 1; i > 0; i--) {
			for (j = nm; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < (2 * i) - 1; k++) {
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
		DiamondStarPatern l = new DiamondStarPatern();
		l.Revan();
		NewBorn();
	}
}