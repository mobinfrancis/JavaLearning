package JavaPrograms;

import java.util.Scanner;

public class CountIntegerCOunt {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int count = 0;
	
		if(!(num<=0))
		{
			while(num!=0)
			{
				num=num/10;
				count++;
				
			}
			System.out.println(count);
		}
		else
		{
			System.out.println("Enter a Positive Number:");
		}

	}

}
