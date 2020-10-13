package JavaPrograms;

import java.util.Scanner;

public class upperCase {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an input String:");
		String input =sc.next();
		String output=input.toUpperCase();
		System.out.println("Output String is :" +output);
		
		
	}

}
