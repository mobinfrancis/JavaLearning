package JavaPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int fact=1;
		
		Scanner s = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = s.nextInt();
	
	if(!(num<=0))
	{
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("Factorial of "+num +"is"+fact);
	}
	else
	{
		System.out.println("Enter a number bigger than zero:");
	}
	}

}
