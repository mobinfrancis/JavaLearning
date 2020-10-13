package coffeebeans;

public class sumOfDigits {

	public static void main(String[] args) {
		
		int num =1456;
		int rem;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10; 
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println(sum);
	}

}
