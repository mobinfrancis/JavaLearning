package Collections;

import java.util.ArrayList;

public class arrayListPgm {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mobin");
		al.add("Monisha");
		al.add("Annu");
		al.add("Kunju");
	
		
		System.out.println("------CONTENTS IN ARRAYLIST----");
		System.out.println(al);
		//Can use contains directly in the arraylist
		System.out.println(al.contains("Francis"));

	}

}
