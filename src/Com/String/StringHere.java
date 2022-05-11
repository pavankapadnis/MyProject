package Com.String;

public class StringHere {

	String st = new String("Hello Mr. Pavan Kapadnis");
	String st1 = "Hello how are you brother";

	public static void main(String[] args) {

		StringHere sh = new StringHere();
		System.out.println(sh.st + "\n");
		System.out.println(sh.st1 + "\n");

		// It returns char value for the particular index

		char a = sh.st.charAt(6);
		System.out.println("Char At Index 6 of String st is " + a + "\n");

		// It returns string length

		int n = sh.st.length();
		System.out.println("Lenght of String ST is " + n + "\n");

		// It returns substring for given begin index. Starting index incuded.

		String ns = sh.st.substring(6);
		System.out.println("Substring to make new string from index 6 = " + ns + "\n");

		/*
		 * It returns substring for given begin index and end index. Staring Index
		 * Included But Last (End Index) index Is Excluded.
		 */

		String ns1 = sh.st.substring(6, 12);
		System.out.println("Substring to make new string from index 6 to index 12 = " + ns1 + "\n");

		// It returns true or false after matching the sequence of char value.

		boolean sb = sh.st.contains("avan");
		System.out.println("Containd Method avan or not = " + sb + "\n");

		// It returns a joined string.
		String joinnew = String.join(" ", sh.st, sh.st1);// First Parameter is determined that to which character are
															// place between two strings.
		System.out.println("Join St and St1 = " + joinnew + "\n");

		// It returns a joined string.

		String date = String.join("/", "25", "06", "2018");
		System.out.print(date + "\n");

		String time = String.join(":", "12", "10", "10");
		System.out.println(" " + time + "\n");

		// It checks the equality of string with the given object.

		boolean bn1 = sh.st.equals(sh.st1);
		System.out.println("Its check st and st1 Are Equals or not = " + bn1 + "\n");

		// It checks if string is empty.

		boolean bn2 = sh.st.isEmpty();
		System.out.println("Return True of False if String Empty or Not = " + bn2 + "\n");

		// It concatenates the specified string.

		String stct = sh.st.concat(sh.st1);
		System.out.println("Concat String st And String st1 = " + stct + "\n");

		// It replaces all occurrences of the specified char value.

		String stnew = sh.st.replace('a', 'p');
		System.out.println("After replace a into p In String st is = " + stnew + "\n");

		// It replaces all occurrences of the specified CharSequence.

		String stnew1 = sh.st.replace("Pavan", "Kapadnis");
		System.out.println("After replace a into p In String st is = " + stnew1 + "\n");

		// It compares another string. It doesn't check case.

		boolean stnew2 = sh.st.equalsIgnoreCase(sh.st1);
		System.out.println("Ignore the case return two String equal or not = " + stnew2 + "\n");

		// It returns a split string matching regex.

		String[] stary = sh.st.split(" ");
		for (String stst : stary) {
			System.out.println(stst);
		}
		System.out.println("Split String st from White Spaces = " + stary + "\n");

		// It returns a split string matching regex and limit. How many new String
		// Generate that we passed in int like 2.

		String[] stary1 = sh.st.split(" ", 2);// Here 2 means Two String Generated.
		for (String stst1 : stary1) {
			System.out.println(stst1);
		}
		System.out.println("Split String st from White Spaces = " + stary1 + "\n");

		// It returns the specified char value index. From Starting Index.

		int stint = sh.st.indexOf('a');
		System.out.println("Index of char a in String st = " + stint + "\n");

		// It returns the specified char value index starting with given index.

		int stint1 = sh.st.indexOf(a, 5);
		System.out.println("Index of char starting with given index in String st = " + stint1 + "\n");

		// It returns the specified substring index.

		int stint2 = sh.st.indexOf("Pavan");
		System.out.println("Index of the specified substring a in String st = " + stint2 + "\n");

		// It returns the specified substring index starting with given index.

		int stint4 = sh.st.indexOf("Pavan", 4);
		System.out
				.println("Index of the specified substring starting with given index in String st = " + stint4 + "\n");

		// It returns a string in lowercase.

		String sst = sh.st.toLowerCase();
		System.out.println("Covert String st into Lowercase = " + sst + "\n");

		// It returns a string in uppercase.

		String sst1 = sh.st.toUpperCase();
		System.out.println("Covert String st into Lowercase = " + sst1 + "\n");

		// It removes beginning and ending spaces of this string.

		String sst2 = sh.st.trim();
		System.out.println("Covert String st into Lowercase = " + sst2 + "\n");

		// This method is used for convert String Into character Array.

		char[] x = sh.st.toCharArray();
		System.out.println("In Character Array Value at x[6] Is = " + x[6] + "\n");

		// This Method is used for Last occurence index of Specific Character.

		int lstin = sh.st.lastIndexOf('a');
		System.out.println("Last Occurance Index of char a Is = " + lstin + "\n");

	}
}
