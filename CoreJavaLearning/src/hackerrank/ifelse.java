package hackerrank;

public class ifelse {

	public static void main(String[] args) {
		int num=22;
		
		if(num%2!=0)
		{
			System.out.println("Weird");
		}
		else if((num%2==0)&& (num>=2 && num <=5))
		{
			System.out.println("Not Weird");
		}
		else if((num%2==0)&&(num>=6 && num <=20))
		{
			System.out.println("Weird");
		}
		else if ((num%2==0)&&(num>20))
		{
			System.out.println("Not Weird");
		}

	}

}
