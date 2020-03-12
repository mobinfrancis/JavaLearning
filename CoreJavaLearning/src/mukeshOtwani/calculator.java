package mukeshOtwani;

public class calculator  implements interface1{

	public static void main(String[] args) {
		//--------------------------------------------------------------------------------------
		//Scenario 1: child Class reference -child Class object ( all methods of parent & child)
		
		calculator c = new calculator();
		c.add();
		c.sub();
		c.mult();
		c.div();
		//---------------------------------------------------------------------------------------
		//Scenario 2: Base class reference - base class object( cannot create object fro interface)
		//interface1 in = new interface1();
		//---------------------------------------------------------------------------------------
		
		//Scenario 3: Base class reference and child class object( only methods of base class
		interface1 in = new calculator();
		in.add();
		in.mult();
		in.sub();
//------------------------------------------------------------------------------------------
		//Scenario 4: child class reference and parent class object(cannot create)
		//calculator c =new interface1();
		
//piValue = 3.17;  cannot change the value of pi
	}
public void div()
{
System.out.println("division - child class");	
}
	@Override
	public void add() {
		
		{
			System.out.println("adding - base interface ");
		}
	}

	@Override
	public void sub() {
		
		System.out.println("subtracting -base interface");
	}

	@Override
	public void mult() {
		
		System.out.println("multiplying- base interface");
	}

}
