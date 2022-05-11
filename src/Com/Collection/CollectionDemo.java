package Com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Collection<String> c; // This is interface we cannot create object of any interface. i.e. we create only referrence variable.
		
		/*
		 * Here we create an Array with miltiple DataTypes. But its not a heterogenous Array. 
		 * Its A simple homogeneous Array. Which DataTypes is Object. 
		 * All elemets in this are Implicit type Casted in Object. I.e. its a Homogeneous Array.
		 */
		
		Object[] x = {10,4.15f,true, 12.25}; // Here 10 not a Integer. And true not a Beelean. Here all elemets are Objects.
		
		for (int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	
	/*
	 * Colelction can support multiple DataStructure like Stack, Array, Queue,
	 * Linked list, Doubly link List And Hashtable And so on.
	 */
}
