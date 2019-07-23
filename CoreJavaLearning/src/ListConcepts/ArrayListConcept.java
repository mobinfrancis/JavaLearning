package ListConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		int array[]=new int[100]; // Fixed Array
		
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(110);
		arr.add(104);
		arr.add(1034);
		arr.add(1012);
		arr.add(103);
		arr.add(106);
		arr.add(1078);
		arr.add(1047);
		arr.add(1099);
		arr.add(1000);
		arr.add(101);
		System.out.println("Size of this array is :"+arr.size());
		
		System.out.println("Contents in this array are:: "+arr);
		
		//--------------------------
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}

	}

}
