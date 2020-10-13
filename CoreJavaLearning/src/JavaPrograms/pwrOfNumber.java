package JavaPrograms;

public class pwrOfNumber {

	public static void main(String[] args) {
		int base=3;
		int exp=4;
		int result = 1;
		//Method 1
		
		for(int i=1;i<=exp;i++)
		{
			result=result*base;
		}
		System.out.println(result);
		
		//Method 2
		System.out.println(Math.pow(base, exp));

	}

}
