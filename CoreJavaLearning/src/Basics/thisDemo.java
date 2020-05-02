package Basics;

public class thisDemo {

	int age =25;
	
	public void getAge()
	{
		int age = 40;
		System.out.println("My age is  "+age);
		System.out.println("Age by using this "+this.age);
	}
	public static void main(String[] args) {
		thisDemo td= new thisDemo();
		td.getAge();

	}

}
