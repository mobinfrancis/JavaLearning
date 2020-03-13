package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapPgm {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Kunju");
		hm.put(9, "Annu");
		hm.put(7, "Francis");
		System.out.println("ALL ELEMENTS"+ hm);
		System.out.println("VALUE @ 9th KEY iS: "+hm.get(9));
		Set s =hm.entrySet();//storing the hashmap as a set
		Iterator it=s.iterator();
		//Traversing though iterator
		System.out.println("PRINTING WITH ITERATOR");
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		while(it.hasNext())
			
		{
			
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
