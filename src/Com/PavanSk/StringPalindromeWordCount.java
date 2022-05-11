package Com.PavanSk;

public class StringPalindromeWordCount {

	public static void main(String[] args) {
		String str = "Nitin is studying iti in fitter. He can then design racecar level 1";
		int count =0;
		String str4[] = str.split(" ");
		String revers = " ";
		for (int j = 0; j < str4.length; j++) {
			StringBuffer new1 = new StringBuffer(str4[j]);
			StringBuffer rev = new1.reverse();
			if(str4[j].contentEquals(rev)) {
				count++;
			}
			revers += rev + " ";
		}
		//System.out.println(revers.trim());
		System.out.println(count);
	}
}
