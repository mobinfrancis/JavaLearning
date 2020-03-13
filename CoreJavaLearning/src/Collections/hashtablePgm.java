package Collections;

import java.util.HashMap;
import java.util.Hashtable;

public class hashtablePgm {

	public static void main(String[] args) {
		//HASHTABLE - NOT ALLOWS NULL KEYS & VALUES
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(0, "hello"); 
		ht.put(1, "Gudbye");
		ht.put(42, "morning");
		ht.put(3, "evening");
		ht.put(4, "evening");
		//ht.put(null, "Summer");
		System.out.println(ht);
		//HASHMAP
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2, "Apple");
		hm.put(1, "Orange");
		hm.put(null, "Guava");
		hm.put(null, null);
		
		System.out.println(hm);

	}

}
