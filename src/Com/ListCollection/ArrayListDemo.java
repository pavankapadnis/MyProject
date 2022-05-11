package Com.ListCollection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//al.add("ypavanaarumadhuri");
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		
		int ak = al.get(1)+500;
		System.out.println("Addition of al[1] with 500 is = "+ak+"\n");
		
		int am = al.size();
		System.out.println(am+"\n");
		al.remove(5);
		//al[0]+=10;
		Object[] ar = al.toArray();
		for(int j = 0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
		System.out.println("\n");
		System.out.println(al);
		
		
		//METHIDS OF COLLECTION
		
		//This method is used for know the size of collection.
		
		int size = al.size();
		System.out.println("Size of ArrayList al is = "+size+"\n");
		
		//This methos is used for delete the particular element from collection. 
		
		al.remove(5);
		System.out.println("After removing 5th index ArrayList is = "+al+"\n");
		
		ArrayList<Integer> al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(600);
		al2.add(700);
		al2.add(800);
		al2.add(900);
		
		//This method is used for copy one collection to another collection.
		
		al.addAll(al2);
		
		System.out.println("After adding collection al2 into collecion al is = "+al+"\n");
		
		//This method is used for delete common elements from two collections.
		
		al.removeAll(al2);
		System.out.println("RemoveAll method remove common elements in collection al and al2 = "+al+"\n");
		System.out.println(al2);
		
		//This method is used for particular element present in collection or not.
		
		boolean bl = al.contains(100);
		System.out.println("Collection al contains 100 or not = "+bl+"\n");
	}
}
