package JavaPrograms;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  a Number:");
		int num =s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+num+"="+i*num);
		}

	}

}
