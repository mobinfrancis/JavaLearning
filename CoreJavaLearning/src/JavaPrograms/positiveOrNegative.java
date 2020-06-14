package JavaPrograms;

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Number:");
	double num=s.nextDouble();
	if(num!=0.0) {
		if(num>0.0)
	{
		System.out.println("Positive ");
	}
	else
	{
		System.out.println("Negative Number");
	}
	
	

	}
	else
	{
		System.out.println("Number is Zero");
	}

}
}

