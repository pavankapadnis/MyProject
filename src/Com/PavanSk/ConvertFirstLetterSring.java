package Com.PavanSk;

public class ConvertFirstLetterSring {

	public static void main(String[] args) {
		String str = "i love testing shastra";

		String str4[] = str.split(" ");
		int str2 = str.codePointCount(0, str.length());
		System.out.println(str4.length);
		System.out.println(str2);
		

		String convert = "";
		for (int i = 0; i < str4.length; i++) {
			String frl = str4[i].substring(0, 1);
			String rem = str4[i].substring(1);
			convert += frl.toUpperCase() + rem + " ";
		}
		System.out.println(convert.trim());
		
		//String split And capitalized firtst word readymade Programme
		/*
		 * String word[]=str.split("\\s"); String capital=""; for(String w:word ) {
		 * String first = w.substring(0,1); String afterfirst = w.substring(1);
		 * capital+=first.toUpperCase()+afterfirst+" "; } System.out.println(capital);
		 */	

	}
}
