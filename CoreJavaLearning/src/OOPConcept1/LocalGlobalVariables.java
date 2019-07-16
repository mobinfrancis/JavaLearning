package OOPConcept1;

public class LocalGlobalVariables {
//Global Variables/Class variables
	int age =25;
	String name ="Mobin";
	public static void main(String[] args) {
		int slno=2; //Local Variables
		
		LocalGlobalVariables obj = new LocalGlobalVariables();
		
		System.out.println(obj.name);
		obj.sum();

	}

	public void sum()
	{
		int no1=1000;
		int no2=2000;
		int age = 25;
		System.out.println(age);
	}
}
