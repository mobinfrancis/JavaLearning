package JavaPrograms;

public class revEachWrdInString {

	public static void main(String[] args) {
		
		String org ="ABC DEF GHI";
		String revString="";
		String[] splitted = org.split(" ");
		
		for(int i=0;i<splitted.length;i++)
		{
			String word=splitted[i];
			String revWord="";
			for(int  j =word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);
		
		
		
	}
		


}
