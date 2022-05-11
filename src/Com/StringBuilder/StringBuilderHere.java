package Com.StringBuilder;

public class StringBuilderHere {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("I Love My India");

		// Here doent need to create new refference variable to store the appended
		// (concatenate) string.

		sb.append(" I love My Country");
		System.out.println(sb + "\n");

		StringBuilder sb1 = new StringBuilder(sb);

		// Here reverse the string.
		sb.reverse();
		System.out.println("Reverse StringBuilder sb in sb1 = " + sb + "\n");

		// CharAt method to return char At specifies index.
		char c = sb1.charAt(4);
		System.out.println("Char at 5th position in string sb = " + c + "\n");

		StringBuilder sb2 = new StringBuilder(10);

		/*
		 * Ensures that the capacity is at least equal to the specified minimum. If the
		 * current capacity is less than the argument, then a new internal array is
		 * allocated with greater capacity. The new capacity is the larger of:
		 */

		sb2.ensureCapacity(1);
		sb2 = sb2.append("Hello mr john how are you");
		System.out.println(sb2 + "\n");

		// Find the lengtgh of sb2 StringBuilder.

		int ln = sb2.length();
		System.out.println(ln);

		// Here insert new string in StringBuilder sb2 At the end of sb2.

		sb2.insert(sb2.length(), " Im Fine");
		System.out.println("Insert sb2 at 10 index in sb2 = " + sb2 + "\n");

		// Replace the string from Start Index to EndIndex.

		sb2.replace(0, 10, "1234567890");
		System.out.println("Replace the sb2 from o to 10 index = " + sb2 + "\n");

		// Delete the string from Start Index to EndIndex.

		sb2.delete(0, 10);
		System.out.println("Delete the sb2 from o to 10 index = " + sb2 + "\n");

		// To find Current capacity of StringBuilder sb2.

		int cp = sb2.capacity();
		System.out.println("Capacity of string sb2 is = " + cp + "\n");

	}
}
