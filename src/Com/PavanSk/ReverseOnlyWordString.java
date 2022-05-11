package Com.PavanSk;

public class ReverseOnlyWordString {

	public static void main(String[] args) {
		String str = "Hello Testing Shatra";

		String str4[] = str.split(" ");
		String revers = " ";
		for (int j = 0; j < str4.length; j++) {
			StringBuffer new1 = new StringBuffer(str4[j]);
			StringBuffer rev = new1.reverse();
			revers += rev + " ";
		}
		System.out.println(revers.trim());

	}
}
