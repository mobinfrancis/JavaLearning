package mukeshOtwani;

public class childClass extends baseClass {

	public static void main(String[] args) {
	// 1) CHILD CLASS REFERENCE - CHILD CLASS OBJECT
		childClass cc = new childClass();
		cc.baseMethod1();
		cc.baseMethod2();
		cc.childMethod1();
		cc.childMethod2();
	//2) BASE CLASS REFERENCE - BASE CLASS OBJECT
		baseClass bc = new baseClass();
		bc.baseMethod1();
		bc.baseMethod2();

	//3)BASE CLASS REFERENCE - CHILD CLASS OBJECT
		baseClass obj1 = new childClass();
		obj1.baseMethod1();
		obj1.baseMethod2();
		
	//4) CHILD CLASS REFERENCE - PARENT CLASS OBJECT
		//childClass obj2= new baseClass();
		//not possinle!! since child cannot hold a parent
		

	}

	public void childMethod1() {
		System.out.println("CHILDMETHOD1::IAM IN CHILDCLASS");
	}

	public void childMethod2() {
		System.out.println("CHILDMETHOD2::IAM IN CHILDCLASS");
	}

}
