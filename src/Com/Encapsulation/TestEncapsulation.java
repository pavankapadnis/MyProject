package Com.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();

		// setting values of the variables
		obj.setName("Pavan");
		obj.setAge(28);
		obj.setRoll(46);

		// Displaying values of the variables
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Roll No: " + obj.getRoll());

		// Direct access of geekRoll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.geekName);
	}
}
