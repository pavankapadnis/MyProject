package Com.Constructor;

public class C extends B {

	int a, b, c, d;
	{
		System.out.println("This Is Block Of C");
	}

	public C() {
		super();
		B g = new B(10);
		B h = new B(10, 20);
		B i = new B(10, true);
		B j = new B(20, "Hello String");
		super.l = 100;
		System.out.println(l);
		// super.imethod();
	}

	public C(int s, boolean z) {
		super();

	}
}
