package ignou;

public class thiskeyword {
							int age =26; 
	
							public  void ageCalc()
	{
		int age =30;
		System.out.println("Age within function"+age);
		System.out.println("Age with this variable"+this.age);
	}

	  						public static void main(String[] args) {
	  						thiskeyword tk = new thiskeyword();
	  						tk.ageCalc();
	
	  					}

}
