package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static<E> void main(String[] args) {
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

		//Java Generics <Integer>, <String> ,<Boolean> etc
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(123);
		
		System.out.println(arr1);
		
		ArrayList<E> arr2 = new ArrayList<E>();
		
		//Employee Class Objects
		Employee e1 =new Employee("Mobin", 25, "ECE");
		Employee e2 =new Employee("tom", 26, "EEE");
		Employee e3 =new Employee("bhaskar", 25, "ECE");
		Employee e4 =new Employee("shaheer", 25, "CSE");
		
		//create arraylist
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e3);
		emp.add(e1);
		emp.add(e4);
		
		
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext())
		{
			Employee emp1 = it.next();
			System.out.println(emp1.age);
			System.out.println(emp1.dept);
			System.out.println(emp1.name);
		}
	// Operations : Addition,deletion
		ArrayList<String> emp1 = new ArrayList<String>();
		emp1.add("Mobin");
		emp1.add("Jaya");
		emp1.add("Rintu");
		emp1.add("Maya");
		ArrayList<String> emp2 = new ArrayList<String>();
		emp2.add("Mobin");
		emp2.add("mfranci");
		emp2.add("akajur1");
		emp2.add("Maya1");
		
		System.out.println("Elements in emp1::"+emp1);
		//adding elments from emp2 to emp1
		emp1.addAll(emp2);
		System.out.println("Adding emp1+emp2  = "+emp1);
		//deleting elements from emp1 
		emp1.removeAll(emp2);
		System.out.println("After removing emp2 from emp1="+emp1);
		emp1.addAll(emp2);
		System.out.println("Adding again elements from emp2"+emp1);
		
		//printing common elememts
		emp1.retainAll(emp2);
		
	System.out.println(emp1);
		
	
		
		
		
	}

}
