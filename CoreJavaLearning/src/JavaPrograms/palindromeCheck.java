package JavaPrograms;

public class palindromeCheck {

	public static void main(String[] args) {
		int num =182;
		int rev =0;
		
		int actualNum=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(actualNum==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
