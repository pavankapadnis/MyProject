package Com.Constructor;

public class B {
	int l, m;
	final int j;
	boolean z;
	String y;

	public void imethod() {
		System.out.println("This is B Private Static Method");

	}

	public B() {
		this(2);
		System.out.println("This Parent Constructer No-Argument");
		this.imethod();
		System.out.println();
	}

	public B(int s) {
		l = s;
		j = 10;
		System.out.println("This Parent Constructer Single Argument");
		System.out.println("Value of Integer L is " + l);
		System.out.println();
	}

	public B(int s, int y) {

		l = s;
		m = y;
		System.out.println("This Parent Constructer Two Argument");
		System.out.println("Value of Integer L is " + l);
		System.out.println("Value of Integer M is " + m);
		System.out.println();
	}

	public B(int s, boolean z) {
		l = s;
		z = z;
		System.out.println("This Parent Constructer Two Argument Multi DT");
		System.out.println("Value of Integer L is " + l);
		System.out.println("Value of Boolean Z is " + z);
		System.out.println();
	}

	public B(int s, String m) {
		l = s;
		y = m;
		System.out.println("This Parent Constructer Multiple Argument");
		System.out.println("Value of Boolean L is " + l);
		System.out.println("Value of String Y is " + y);
		System.out.println();
	}

	public static void main(String[] args) {
		// super();
		C d = new C();
		d.imethod();

	}
}
