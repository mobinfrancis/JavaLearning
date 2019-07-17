package OOPConcept1;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(12);
		obj.sum(10, 45);
	}	
public void sum()
{
	System.out.println("Sum Method 1 - No Parameter");
}

public void sum(int a )
{
	System.out.println("Sum Method 2 - One Parameter"+a );
}

public void sum(int a, int b  )
{
	System.out.println("Sum Method 2 -Two Parameter"+a+b);
}
	

}
