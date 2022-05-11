package Com.Constructor;

import java.util.Iterator;
import java.util.Scanner;

public class A {

	public void Array() {
		int[] x = { 10, 40, 8, 12, 46, 88, 74, 92, 85, 68 };
		int[] y = { 92, 44, 88, 47, 57, 95, 22, 28, 17, 62 };
		int i, j, k, l;

		System.out.println("Original Value of Array X is");
		for (k = 0; k < x.length; k++) {
			System.out.print(x[k] + " ");
		}
		System.out.println();
		System.out.println("Original Value of Array Y is");
		for (l = 0; l < x.length; l++) {
			System.out.print(y[l] + " ");
		}

		for (i = 0; i < x.length; i++) {
			j = 0;
			j = x[i];
			x[i] = y[i];
			y[i] = j;
		}
		System.out.println();
		System.out.println("After Swapping Value of Array X is");
		for (k = 0; k < x.length; k++) {
			System.out.print(x[k] + " ");
		}
		System.out.println();
		System.out.println("After Swapping Value of Array Y is");
		for (l = 0; l < x.length; l++) {
			System.out.print(y[l] + " ");
		}

		for (i = 0; i < x.length; i++) {
			for (j = x.length - 1; j > i; j--) {
				k = 0;
				if (x[i] > x[j]) {
					k = x[i];
					x[i] = x[j];
					x[j] = k;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting Value of Array X is");
		for (k = 0; k < x.length; k++) {
			System.out.print(x[k] + " ");
		}

		for (i = 0; i < y.length; i++) {
			for (j = y.length - 1; j > i; j--) {
				k = 0;
				if (y[i] > y[j]) {
					k = y[i];
					y[i] = y[j];
					y[j] = k;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting Value of Array X is");
		for (k = 0; k < y.length; k++) {
			System.out.print(y[k] + " ");
		}
	}
}
