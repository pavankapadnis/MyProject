package Com.Constructor;

import Com.PavanSk.Demo;

public class FinalVariable {
	final int m;

	private void Demo(int s) {
		final int l = s;
		System.out.println("This is Demo Methos value of Final L is " + l);
	}

	public FinalVariable(int z) {
		this.m = z;
		System.out.println("This is Constructor value of M is " + m);
	}

	public static void main(String[] args) {
		FinalVariable fn = new FinalVariable(200);
		fn.Demo(50);
		FinalVariable fm = new FinalVariable(400);
		fm.Demo(500);
	}
}
