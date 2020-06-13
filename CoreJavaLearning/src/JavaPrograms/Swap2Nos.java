package JavaPrograms;

public class Swap2Nos {

	public static void main(String[] args) {
		
		//SWAPING NO USING TEMP VARIABLE
		
		int num1=10;
		int num2=13;
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println(num1);
		System.out.println(num2);
		
		//SWAPING WITHOUT TEMP
		int a=10;
		int b=35;
		a=a+b; //45
		b=a-b;//10
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
