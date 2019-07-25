package OOPConcept2;

public class ExceptionHandlingConcepts {

	public static void main(String[] args) {
		//Uncaught Exception
		//int b =10/0; 
		
		
		//Caught Exception
		//Thread.sleep(5000);
		
		//Implementing Try catch block
		try {
			int i =10/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("ABC");
	}

}
