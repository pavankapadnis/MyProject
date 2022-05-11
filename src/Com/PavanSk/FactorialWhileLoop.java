package Com.PavanSk;

import java.util.Scanner;

public class FactorialWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, temp;

		for (j = 0; j < 1; j++) {
			System.out.println("Enter The Number ");
			int num = sc.nextInt();

			temp = 1;
			i=1;
			while(i<=num){
				temp=temp*i;
				i++;
			}
			System.out.println("Factorail of " + num + " Is " + temp);
		}
		


		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		int x = -5;
		int y = 10;
		int k = 55;
		int m = 42;
		Math.max(x, y);
		System.out.println(Math.abs(x));
		System.out.println((int)(Math.random() * 201));
		System.out.println((int)(Math.random() * 101));
		System.out.println((int)(Math.random() * 101));
		System.out.println((int)(Math.random() * 101));
		System.out.println((int)(Math.random() * 201));

	}
}
