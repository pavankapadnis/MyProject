package Com.PavanSk;

public class DigitAddition {
	
	public static void main(String[] args) {
		int i, a, b, c;
		a = 0;
		b = 0;
		c = 0;
		i = 20;
		while (i > 0) {
			a = i % 10;
			c = c + a;//
			i = i / 10;
		}
		System.out.println(c);
	}

}
