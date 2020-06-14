package JavaPrograms;

public class fibonacciSeries {

	public static void main(String[] args) {
		int limit=10;
		int f1=0;
		int f2=1;
		
		for(int i=1;i<=limit;i++)
		{
			System.out.println(f1);
			int sum =f1+f2;
			f1=f2;
			f2=sum;
		
		}
		


	}
}
