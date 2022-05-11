package Com.PavanSk;

import java.util.Scanner;

public class ContainCharInString {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ener a String Here");
			Scanner sc = new Scanner(System.in);
			String str2 = "Pavan";
			String str = new String(sc.nextLine());
			boolean str1 = str.contains(str2);
			if(str1==true) {
				System.out.println(str2+" Is present in a given string");
			}else {
				System.out.println(str2+" Is Not present in a given string");
			}
			//System.out.println(str1);
		}
	}
}
