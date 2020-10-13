package ignou;

import java.util.Scanner;

public class searchNum {

	public static void main(String[] args) {
		 int arr[]= {10,13,1,199,90,23,45};
		 Scanner s = new Scanner(System.in);
		 int value=s.nextInt();
		 boolean found = false;
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 if(value==arr[i])
			 {
				 found=true;
				 break;
			 }
			 
		 }
		 if(found)
		 {
			 System.out.println("Element Found");
		 }
		 if(!found)
		 {
			 System.out.println("Not Found!");
		 }
	}

}
