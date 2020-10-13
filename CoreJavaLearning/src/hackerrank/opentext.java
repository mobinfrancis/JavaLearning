package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class opentext {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
	
		String[] words = str.split(" ");
		String reversedString = "";
		//System.out.println(Arrays.toString(words));
		//System.out.println(words[1].length());
		for (int i = 0; i < words.length; i++)
		{
			int count = words[i].length();
			//System.out.println(count);
			if(count%2==0)
			{
				System.out.println(words[i]);
			}
			else
			{
				for (int k = 0; k < words.length; k++)
		        {
		           String word = words[k]; 
		           String reverseWord = "";
		           for (int j = word.length()-1; j >= 0; j--) 
			   {
				
				reverseWord = reverseWord + word.charAt(j);
			   }
			   reversedString = reversedString + reverseWord + " ";
			}
				
			}
		}
			
		
		//System.out.println(str);
		System.out.println(reversedString);

}
}
