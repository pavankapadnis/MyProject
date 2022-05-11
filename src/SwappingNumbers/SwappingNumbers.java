package SwappingNumbers;

public class SwappingNumbers {

	public static void main(String[] args) {

		// Swapping two variables With using third variable.

		int m = 20;
		int n = 40;
		int l = 0;

		System.out.println("Intiatially M = " + m + " And N = " + n);

		l = m;
		m = n;
		n = l;

		System.out.println("After Swapping M = " + m + " And N = " + n);

		// Swapping two variables without using third variable.

		int x = 20;
		int y = 40;

		System.out.println("Intiatially x = " + x + " And Y = " + y);

		x = y + x;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping x = " + x + " And Y = " + y);

		// Swapping three variables With using Fourth variable.

		int s = 20;
		int d = 40;
		int f = 60;
		int g = 0;

		System.out.println("Intiatially S = " + s + " And D = " + d + " And F " + f);

		g = f;
		f = s;
		s = g;
		g = 0;
		g = d;
		d = s;
		s = g;
		
		System.out.println("After Swapping S = " + s + " And D = " + d + " And F " + f);

		// Swapping Three variables without using Fourth variable.

		int a = 20;
		int b = 40;
		int c = 60;

		System.out.println("Intiatially A = " + a + " And B = " + b + " And c " + c);

		a = c + a;// 80
		c = a - c;// 20
		a = a - c;// 60

		a = b + a;// 100
		b = a - b;// 60
		a = a - b;// 40

		System.out.println("After Swapping A = " + a + " And B = " + b + " And c " + c);

	}

}
