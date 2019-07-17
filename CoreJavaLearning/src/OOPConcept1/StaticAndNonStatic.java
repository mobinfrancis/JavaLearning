package OOPConcept1;

public class StaticAndNonStatic {
	String name ="Mobin"; //Non Static Global variable
	static int age =25; //Static Global Variable

	public static void main(String[] args) {
		StaticAndNonStatic obj = new StaticAndNonStatic();
		
		obj.sendEmail();//Calling Non Static Method using obj
		obj.sum();// Can call static members via obj - not a good practice
		System.out.println(obj.age);//Can call static members via obj - not a good practice
		
		//------CALLING NON STATIC METHOODS------
		sum();// Calling Non Static Method ,(1)
		StaticAndNonStatic.sum();//CAlling Non Static Method ,using classname (2)
		
		System.out.println(age);
		
		
	}
	
	public void sendEmail() // Non Static Method
	{
		System.out.println("Email Sending Method (Non Static Method)");
	}
	 public static  void sum() //Static Method
{
	System.out.println("Sum Method (Static Method)");
}
}
