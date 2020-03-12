package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetPgm {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Annu");
		hs.add("Kunju");
		hs.add("Lousy");
		hs.add("Kunju");// will eliminate duplicate values
		hs.remove("Kunju");// removes kunju
		System.out.println(hs);
		
		Iterator<String>it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
