package Com.PavanSk;

public class ArrayPrimeNumbers {
	public static void main(String[] args) {
		int[] x = { 10, 2, 52, 74, 64, 13, 17, 76, 92, 27, 35, 48, 90, 11, 19, 31, 43, 59 };
		// int[] y = new int[13];
		int i, j, temp;

		System.out.println("Values Of Array X is");
		for (int value : x) {
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println("Prime Numbers Of Array X is");
		for (i = 0; i < x.length; i++) {
			temp = 0;
			for (j = 2; j < x[i]; j++) {
				if (x[i] % j == 0) {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.print(x[i] + " ");
			}

		}

	}
}
