package NumberAdditionWithinString;

import javax.swing.JOptionPane;

public class NumberAdditionWithinString {
	
	public static void main(String[] args) {
		String str = "He110 Te5t19 S75tr2" ;
		int addition=0;
		for(int i=0; i< str.length() ;i++) {
			
			boolean bn = Character.isDigit(str.charAt(i));
			if(bn==true) {
				int c = Integer.parseInt(str.charAt(i)+"");
				addition = addition + c;
			}
		}
		System.out.println(addition);
		
		String a = "15";
		String b = "25"; 
		
		String result;
		try{
		 int value = Integer.parseInt(a)+Integer.parseInt(b);
		 result = String. valueOf(value) ;
		 System.out.println(result);
		}catch(NumberFormatException ex){
		 //either a or b is not a number
		 result = "Invalid input";
		}
		JOptionPane.showMessageDialog(null,result);
	}
	
}
