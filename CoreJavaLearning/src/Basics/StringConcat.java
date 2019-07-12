package Basics;

public class StringConcat {

	public static void main(String[] args) {
		
		int first =200;
		int second = 4000;
		String x ="Hello";
		String y = "World";
		
		double d=13.44;
		double e = 34.56;
		
		System.out.println(first+second+x+y);
		System.out.println(x+y+first+second);
		System.out.println(x+y+(first+second));
		System.out.println(first+second+x+y+first+x+second+y);
		System.out.println(d+e);
		System.out.println(x+d+e);
		
		//print: prints in same line
		//println: prints in a new line

	}

}
