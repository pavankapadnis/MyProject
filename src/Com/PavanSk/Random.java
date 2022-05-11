package Com.PavanSk;

import java.util.Scanner;
import java.util.Iterator;

public class Random {
	static int a;
	static int b=20;
	static int c=15;
	static int x,y,z;
	
	public Random() {
		a=10;
		System.out.println("Hello Constructor "+a);
	}

	public static void NewBorn() {
		a=10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you have Print");
		int nm = sc.nextInt();
		     
		int i,j,k;
		for(i=0; i<=nm;i++) {
			for(j=nm;j>0;j--) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=nm-1; i>0;i--) {
			for(j=nm;j>i-1;j--) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
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
		Random l = new Random();
		//l.Revan();
		NewBorn();
		x=a+b;
		y=b-c;
		z=a*c;
		System.out.println(x+" "+y+" "+c);
	}
}
