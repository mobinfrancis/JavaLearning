package OOPConcept1;

public class FunctioninJava {

	public static void main(String[] args)
	{
		//after creating object,copy of all non static methods will be given to this object
		FunctioninJava obj = new FunctioninJava();
		obj.testm();
		obj.pqr();
		int val=obj.division(20, 2);
		System.out.println(val);
	}
	//void does not retun any values 
		public void testm()//no i/p no o/p
		{
			System.out.println("Test Method");
		}
	
		public int pqr()//no i/p , some o/p
		{
			System.out.println("pqr metho");
			int a=10;
			int b =20;
			int c=a+b;
			return c;
		}
public int division(int x,int y)
{
	System.out.println("Division Method");
	int d=x/y;
	
	return d;
	
}
}
