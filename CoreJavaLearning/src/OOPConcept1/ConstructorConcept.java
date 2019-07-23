package OOPConcept1;

public class ConstructorConcept {
	String name;
	int age;
	
	public ConstructorConcept()
	{
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int a )
	{
		System.out.println("1 Parameterized Constructor");
	}
	
	public ConstructorConcept(int a,int b )
	{
		System.out.println("2 Parameterized Constructor");
	}
	public ConstructorConcept(String name,int age )
	{
		System.out.println("2 Parameterized Constructor");
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		ConstructorConcept con = new ConstructorConcept();
		ConstructorConcept con1 = new ConstructorConcept(10);
		ConstructorConcept con2 = new ConstructorConcept(10,10);
		ConstructorConcept con3 = new ConstructorConcept("Mobin",10);
		System.out.println(con3.age+" "+con3.name);
	}

}
