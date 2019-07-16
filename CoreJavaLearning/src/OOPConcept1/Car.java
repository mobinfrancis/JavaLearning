package OOPConcept1;

public class Car {
	int mod;
	int wheel;

	public static void main(String[] args) {
//	int mod;
//	int wheel;    wont work; a.mod 
	
	Car a =new Car();
	Car b = new Car();
	Car c = new Car();
	a.mod=123;
	a.wheel=3;
	
	b.mod=2019;
	b.wheel=4;
	
	c.mod=2000;
	c.wheel =2;
	
	System.out.println("Before Assigning the references");
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod);
	System.out.println(b.wheel);
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	System.out.println("After Assigning the references");
	
	a=b;
	b=c;
	c=a;
	
	a.mod=20000;
	System.out.println(c.mod);
	

	}

}
