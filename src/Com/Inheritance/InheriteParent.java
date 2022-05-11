package Com.Inheritance;

public class InheriteParent {
	int x,s,a,c,v;

	public void Demo() {
		int x, y, z, m;
		x = 10;
		y = 40;
		z = x + y;
		m = x + y + z;
		System.out.println("This is Demo Method Addition of X , Y And Z is " + m);
	}
	
	public void Demo2() {

		InheriteParent in = new InheriteParent();
		int x, y, z, m;
		x = 20;
		y = 80;
		z = x + y;
		m = x + y + z;
		System.out.println("This is Demo2 Method Addition of X , Y And Z is " + m);
	}

}
