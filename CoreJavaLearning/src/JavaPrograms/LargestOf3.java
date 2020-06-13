package JavaPrograms;

public class LargestOf3 {

	public static void main(String[] args) {
		int num1=1900;
		int num2=900;
		int num3=100;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Num1 is largest"+num1);
		}
		else if(num2>num3)
		{
			System.out.println("Num 2 is largest"+num2);
		}
		else
		{
			System.out.println("Num 3 is largest"+num3);
		}
	}

}
