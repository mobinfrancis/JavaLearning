package coffeebeans;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int len = word.length();
		String  rev ="";
		/*
		Method 1
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+word.charAt(i);
			
		}
		*/
		char[] ar=word.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ar[i];
		}
		System.out.println(rev);

	}

}
