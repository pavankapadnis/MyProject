package Com.PavanSk;

public class Practice {
	
	int j,k;
	
	public Practice(int j) {
		this.j=20;
		System.out.println("This is Constructer Method j = "+j);

	}
	public void m2() {
		this.k=18;
		System.out.println("This is m2 Method k = "+k);
		Practice obj1 = new Practice(80);
	}
	
	public static void main(String[] args) {
		Practice obj1 = new Practice(90);
		//obj1.Practice(20);
		obj1.m2();
		obj1.j=12;
		obj1.k=10;
		System.out.println("This is Main Method J = "+obj1.j);
		System.out.println("This is Main Method k = "+obj1.k);
		
	}
}
