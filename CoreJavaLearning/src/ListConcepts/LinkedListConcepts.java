package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcepts {

	public static void main(String[] args) {
		LinkedList <String>ll = new LinkedList<String>();
		ll.add("Mobin");
		ll.add("Merlin");
		ll.add("Mathew");
		ll.add("Merin");
		System.out.println("Contents in LL are ::"+ll);
		//Adding in First
		ll.addFirst("Sahaheer");
		System.out.println("Contents in LL after adding in first are ::"+ll);
		//Adding in Last
		ll.addLast("Francis");
		System.out.println("Contents in LL after adding in lastt are ::"+ll);
		//removing from first
		ll.removeFirst();
		System.out.println("Contents in LL after deleting from first are::"+ll);
		//deleting from first
		ll.removeLast();
		System.out.println("Contents in LL after deleting from last are::"+ll);
		
		//PRINTING VALUES
		
		//1)For Loop
		for(int i =0;i<ll.size();i++)
		{
			System.out.println("Printing Values using normal for loop::"+ll.get(i));
		}
		
		//2) Advanced For loop
		for(String str : ll )
		{
			System.out.println("Printing using advacned for loop::"+str);
		}
		
		//3) Using Iterator
		
		Iterator <String> it =  ll.iterator();
		while(it.hasNext())
		{
			System.out.println("Printing with Iterator::"+it.next());
		}
		
		//4 WHile Loop
		int num=0;
		while(ll.size()>num)
		{
			System.out.println("Printing with While Loop"+ll.get(num));
			num++;
		}
	}

}
