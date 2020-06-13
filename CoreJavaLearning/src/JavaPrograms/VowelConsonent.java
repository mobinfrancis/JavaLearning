package JavaPrograms;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character:");
		String var=s.next();
		System.out.println("The entered character is :"+var);
		
		switch(var) {
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
		System.out.println("Entered Char is Vowel");
		break;
		default: System.out.println("Not Vowel!");
		
		}




	}

}
