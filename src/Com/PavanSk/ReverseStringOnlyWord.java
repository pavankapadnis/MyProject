package Com.PavanSk;

public class ReverseStringOnlyWord {
	
	public static void main(String[] args) {
		String str = "Hello Testing Shatra";
		//StringBuffer new1[1] = new StringBuffer("testing");
		
		//System.out.println(new1);
		
		String str4[]=str.split(" ");
		String revers = " ";
		for(int j=0; j<str4.length; j++) {
			StringBuffer new1 = new StringBuffer(str4[j]);
			StringBuffer rev = new1.reverse();
			revers+=rev+" ";
		}
		System.out.println(revers.trim());
		 String str1 = str.substring(1); 
		 int str2 = str.codePointCount(0,str.length()); 
		 System.out.println(str4.length);
		 System.out.println(str2); 
		 System.out.println(str1);
		 
		String convert = "";
		for(int i=0; i<str4.length; i++) {
			String frl = str4[i].substring(0,1);
			String rem = str4[i].substring(1);
			convert+=frl.toUpperCase()+rem+" ";
		}
		System.out.println(convert.trim());
		
	}
}
