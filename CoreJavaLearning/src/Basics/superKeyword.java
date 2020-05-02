package Basics;

public class superKeyword extends superKeyword2 {
	String  name="Mobin[from child]";
	
	public void displayName()
	{
		System.out.println("Name is :"+super.name);
	}
	
	public void test()
	{
		super.displayName();
	}

	public static void main(String[] args) {
		superKeyword sk= new superKeyword();
		superKeyword2 sk1 = new superKeyword2();
		
		sk.displayName();
		sk.test();
		
		

	}

}
