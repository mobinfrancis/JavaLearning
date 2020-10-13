package coffeebeans;

public class swap {

	public static void main(String[] args) {
		int a =100;
		int b =20;
		int temp;
	/*	Method 1
	temp=a;
    a=b;
    b=temp;
    */
		a=a+b;//120
		b=a-b; //120-20 =100
		a=a-b;
    System.out.println("a :"+a);
    System.out.println("b :"+b);
	}

}
