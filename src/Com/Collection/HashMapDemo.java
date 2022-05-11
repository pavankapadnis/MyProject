package Com.Collection;
import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
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
		for(int i = 0; i < firstname.size(); i++) {
		    hm.put(firstname.get(i), lastname.get(i));
		}
		
		for (Map.Entry<Object, Object> entry : hm.entrySet())
            System.out.println(entry.getKey() +" "+ entry.getValue());
		
		System.out.println();
		//Another method to iterate Hashmap is.
		
		hm.forEach((k,v) -> System.out.println(k + " " + v));
		
		System.out.println();
		//One Another  method to iterate HashMap.
		
		// looping over keys
        for (Object fname : hm.keySet())
        {
            // search  for value
            Object lname = hm.get(fname);
            System.out.println(fname + " " + lname);
        }
	}
}
