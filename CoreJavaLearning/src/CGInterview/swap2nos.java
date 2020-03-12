package CGInterview;

public class swap2nos {

	public static void main(String[] args) {
		
		
		int a =10;
		int b = 20;
		
		System.out.println("Before Swapping : a" +a);
		System.out.println("Before Swapping : b" +b);
		//LOGIC 1: Using Third Vairable
		
		int temp;
		
		temp =a;
		 a =b;
		 b = temp;
		
		
		System.out.println("AFter Swapping : a" +a);
		System.out.println("After Swapping : b" +b);
		

	}

}
