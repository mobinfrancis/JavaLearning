package sample;

import java.util.Arrays;
import java.util.Comparator;

public class pawan {

	public static void main(String[] args) {
		String testArray[][]= {
				          {"1","Mobin"},
				          {"2","GM"},
				          {"1","Rintu"}
		               };
//Print 2D Array
		System.out.println("---VALUES IN 2D ARRAY---");
		for(int row=0;row<testArray.length;row++)
		{
			for(int col=0;col<testArray[0].length;col++)
			{
				System.out.println(testArray[row][col]);
			}
		}
		
		
		
	}

}
