package JavaPrograms;

import java.util.Scanner;

public class RevInteger {

	public static void main(String[] args) {
		int rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no:");
		int num =s.nextInt();
		/*
		//using algo
	while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		//stringbuilder
		StringBuilder sb= new StringBuilder();
		System.out.println("-----Using StringBuilder----");
		sb.append(num);
		StringBuilder reverse=sb.reverse();
		
		System.out.println(reverse);
		*/
		StringBuffer buff= new StringBuffer();
		buff.append(num);
		System.out.println(buff.reverse());
	}

}
