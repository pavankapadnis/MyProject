package LinkedListExercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<Integer>();
		List<Integer> ll1 = new LinkedList<Integer>();

		ll1.add(500);
		ll1.add(600);

		ll.add(20);
		// ll.add(200);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);
		ll.add(90);
		ll.add(100);
		ll.add(110);
		ll.add(120);
		ll.add(140);
		ll.add(150);

		System.out.println(ll);

		ll.add(1, 400);

		System.out.println(ll);

		ll.set(1, 200);

		System.out.println(ll);

		ll.remove(1);

		System.out.println(ll);

		ll.addAll(ll1);

		System.out.println(ll);

		// LinkedList Iterate in three ways.

		// 1.

		for (int i = 0; i < ll.size(); i++) {

			System.out.print(ll.get(i) + "  ");

		}

		System.out.println();

		// 2.

		for (Integer ekem : ll) {

			System.out.print(ekem + "  ");

		}

		System.out.println();

		// 3.

		Iterator<Integer> it = ll.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}

		ListIterator<Integer> li = ll.listIterator();

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println();
		boolean cont = ll.contains(50);
		System.out.println(cont);

		boolean cont1 = ll.containsAll(ll1);
		System.out.println(cont1);

		for (int i = 0; i < ll.size(); i++) {

			System.out.print(ll.get(i) + "  ");

		}
		System.out.println();
		ll.removeAll(ll1);

		
		

	}

}
