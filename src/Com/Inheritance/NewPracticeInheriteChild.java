package Com.Inheritance;

public class NewPracticeInheriteChild extends NewPracticeInheriteParent {

	@Override
	public void m1() {
		int m, n, o, p;
		m = 80;
		n = 120;
		o = m + n;
		p = n - m;
		System.out.println("This is child class Method " + o + " " + p + "\n");
		super.m1();
		SortedSet
		/*
		 * Here we can call the parent class m1 method to using the Super keywork as we
		 * call earliar Above its pretty simple and Important concept.
		 */
	}

	public static void main(String[] args) {
		NewPracticeInheriteChild nc = new NewPracticeInheriteChild();
		nc.m1();
	}
}
