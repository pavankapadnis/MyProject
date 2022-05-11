package ArraylistExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArraylistIterate {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Pink");
		al.add("Green");
		al.add("Yellow");
		al.add("White");
		al.add("Blue");

		// Iterate Arraylist using ListIterator.

		ListIterator ltr = al.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		// Insert element at first Position.

		al.add(1, "Purpul");
		System.out.println(al + "\n");

		// Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println("retrieve an element (at a specified index) from a given array list = " + al.get(4) + "\n");

		// Write a Java program to update specific array element by given element.

		al.set(1, "Green");
		System.out.println("update specific array element by given element = " + al + "\n");

		// Write a Java program to remove the third element from a array list.

		al.remove(3);
		System.out.println("to remove the third element from a array list = " + al + "\n");

		// Write a Java program to search an element in a array list.

		boolean as = al.contains("Green");
		System.out.println("to search an element in a array list = " + as + "\n");

		// Write a Java program to sort a given array list.

		Collections.sort(al);
		System.out.println("sort a given array list = " + al + "\n");

		// Write a Java program to copy one array list into another.

		ArrayList al2 = new ArrayList(al);
		System.out.println("to copy one array list into another = " + al2 + "\n");

		// Write a Java program to shuffle elements in a array list.

		Collections.shuffle(al);
		System.out.println("to shuffle elements in a array list = " + al + "\n");

		// Write a Java program to reverse elements in a array list

		Collections.reverse(al);
		System.out.println("to reverse elements in a array list = " + al + "\n");

		// Write a Java program to extract a portion of a array list.

		ArrayList al4 = new ArrayList(al.subList(2, 4));// Here 4th index is excluded.
		System.out.println("to extract a portion of a array list. = " + al4 + "\n");

		// Write a Java program to compare two array lists.

		boolean as2 = al2.equals(al4);
		System.out.println(as2);

		// Other method to comparre two Arralist to check element to element.

		// Storing the comparison output in ArrayList<String>
		ArrayList c3 = new ArrayList();
		for (Object e : al)
			c3.add(al2.contains(e) ? "Yes" : "No");
		System.out.println("All emenets are present or not = " + c3 + "\n");

		// Write a Java program of swap two elements in an array list.

		System.out.println("Before Swappig collection al is " + al + "\n");

		Collections.swap(al, 1, 4);
		System.out.println("After Swappig index 1 to index 4 of collection al is " + al + "\n");

		// Write a Java program to join two array lists.

		ArrayList al5 = new ArrayList();
		al5.addAll(al);
		al5.addAll(al2);
		System.out.println("After adding two collection al and al2 in al5 is " + al5 + "\n");

		// Write a Java program to clone an array list to another array list.

		ArrayList al6 = (ArrayList) al.clone();
		System.out.println("to clone an array list to another array list. = " + al6 + "\n");

		// Write a Java program to empty an array list.

		al6.removeAll(al6);
		System.out.println("to empty an array list al6 is = " + al6 + "\n");

		// Write a Java program to test an array list is empty or not.
		
		boolean bl = al6.isEmpty();
		if (bl == true) {
			System.out.println("Arraylist al6 is Empty\n");
		} else {
			System.out.println("Arraylist al6 is Not Empty\n");
		}

		// Write a Java program to trim the capacity of an array list the current list
		// size.

		al5.trimToSize();

		// Write a Java program to increase the size of an array list.

		al6.ensureCapacity(5);

		// Write a Java program to replace the second element of a ArrayList with the
		// specified element.
		System.out.println("Before replace 2nd element of al5 is = " + al5 + "\n");
		al5.set(2, "Hello");
		System.out.println("After replace 2nd element of al5 is = " + al5 + "\n");

		// Write a Java program to print all the elements of a ArrayList using the
		// position of the elements.
		al5.trimToSize();
		int size = al5.size();

		for (int i = 0; i < size; i++) {
			System.out.println(i + " " + al5.get(i));
		}
	}
}
