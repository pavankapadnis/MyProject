package Com.StringBuffer;

import java.util.Scanner;

public class PalindromeStringUsingSB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			
			//Here using String and StringBuffer we can find the string is palindrome or not.

			System.out.println("Please Enter String Here");
			String s = sc.next();
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String s1 = new String(sb);

			if (s.equals(s1)) {
				System.out.println("String is Palindrome\n");
			} else {
				System.out.println("String is Not Palindrome\n");
			}
		}     
	}
}
