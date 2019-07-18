package OOPConcept1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String age ="25";
		System.out.println(age+10);
		int value=Integer.parseInt(age); //  Converting String to Int
		System.out.println(value+20);
		String exp = "12.45";
		Double value1= Double.parseDouble(exp); //Converting String  to Double
		System.out.println(value1+1.25);
		
		
		int sal=10000;
		System.out.println(sal+01);
		
		String conv = String.valueOf(sal);
		System.out.println(conv+01); //Converted Integer into String 

	}

}
