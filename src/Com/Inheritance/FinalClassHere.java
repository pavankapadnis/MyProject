package Com.Inheritance;

private class FinalClassHere {

	int x, y, z, m;

	public void m1() {
		this.x = 10;
		this.y = 40;
		this.z = this.x + this.y;
		this.m = this.z - this.x;
		System.out.println("Addition of X And Y Is " + z);
		System.out.println("Substraction of Z and X Is " + m);
	}

}
