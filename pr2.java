package Program;

import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) 
	{
		String str1, str2;
		Scanner sc = new Scanner(System.in);
			 
		System.out.println("Enter First string");
		str1 = sc.nextLine();
			 
		System.out.println("Enter Second string");
		str2 = sc.nextLine();

		if (str1.contains(str2))
		{
			System.out.print("It contains another string.");
		}
	        
		else
		{
			System.out.print("It doesn't contain another string.");
		}
	}

}
