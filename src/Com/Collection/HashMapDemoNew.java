package Com.Collection;

import java.util.Map.Entry;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemoNew {
	
	public static void main(String[] args) {
		ArrayList<String> firstname = new ArrayList<String>();
		firstname.add("Shbham");
		firstname.add("Aditya");
		firstname.add("Akash");
		firstname.add("Bupendra");
		firstname.add("Ashish");
		
		ArrayList<String> lastname = new ArrayList<String>();
		lastname.add("Sadavarte");
		lastname.add("Shinde");
		lastname.add("Gaikwad");
		lastname.add("Bhagat");
		lastname.add("Shelke");
		
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(1,firstname);
		hm.put(2,lastname);
		
		Set<Entry> entries = hm.entrySet();
		for(Entry entry : entries ) {
			
		}
		
		System.out.println(hm);
	}
}
