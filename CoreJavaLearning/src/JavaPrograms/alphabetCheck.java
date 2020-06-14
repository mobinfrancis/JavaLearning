package JavaPrograms;

public class alphabetCheck {

	public static void main(String[] args) {
		//METHOD 1
		String c="@";
		if(c.matches("[A-Za-z]"))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not Alphabhet");
		}
		
		//METHOD 2
		char val='A';
		if(val>='a' && val<='z' || val>='A' && val<='Z')
		{
			System.out.println("Alphabhet");
		}
		else
		{
			System.out.println("Not an Alphabhet");
		}
	}

}
