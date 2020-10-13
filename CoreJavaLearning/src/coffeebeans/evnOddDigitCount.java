package coffeebeans;

public class evnOddDigitCount {

	public static void main(String[] args) {
		int num=12346;
		int ecount=0;
		int ocount=0;
		int rem;
		
		
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
			num=num/10;
		}
		System.out.println("Even Nos:"+ecount);
		System.out.println("Odd Nos:"+ocount);

	}

}
