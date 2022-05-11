package ArraylistExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MidSeleniumPracticeArraylist {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(500);
		al1.add(600);
		
		al.add(20);
		//al.add(200);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		al.add(120);
		al.add(140);
		al.add(150);
		
		System.out.println(al);
		
		al.add(1, 400);
		
		System.out.println(al);
		
		al.set(1, 200);
		
		System.out.println(al);
		
		al.remove(1);
		
		System.out.println(al);
		
		al.addAll(al1);
		
		System.out.println(al);
		
		//ArrayList Iterate in three ways.
		
		//1.
		
		for(int i =0; i<al.size(); i++) {
					
			System.out.print(al.get(i)+"  ");
			
		}
		
		System.out.println();
		
		for(Integer ekem : al) {
			
			System.out.print(ekem+"  ");
			
		}
		
		System.out.println();
		
		Iterator<Integer> it =  al.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		boolean cont = al.contains(50);
		System.out.println(cont);
		
		boolean cont1 = al.containsAll(al1);
		System.out.println(cont1);
		
		for(int i =0; i<al.size(); i++) {
			
			System.out.print(al.get(i)+"  ");
			
		}
		System.out.println();
		al.removeAll(al1);
		
		for(int i =0; i<al.size(); i++) {
			
			System.out.print(al.get(i)+"  ");
			
		}
		
	}

}
