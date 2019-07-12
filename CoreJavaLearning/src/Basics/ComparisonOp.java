package Basics;


public class ComparisonOp {

	
	public static void main(String[] args) {
		/*IF ELSE CONCEPT
		 ----------------------------------------------------
		 */
		int a =100;
		int b=100;
		
		if(a>b)
		{
			System.out.println(" A is greater than B");
		}
		else
		{
			System.out.println("B is greater than A");
		}
		//COmparison Op

		if(a==b)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//Finding Largest of three no
		int x = 25;
		int y = 4500;
		int z = 20000;
		
		if(x>y && x>z)
		{
			System.out.println("X is Biggest");
			
		}
		
		else if(y>z)
		{
			System.out.println("Y is Biggest");
		}
		
		else
		{
			System.out.println("Z is largest");
		}
	}

}
