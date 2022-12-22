package Program;

import java.util.Scanner;

public class pr1
{
	public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Name");
		String s1=sc.nextLine();
		System.out.println("Confirm You Name");
			
		String s2=sc.nextLine();
	
		if(s1.equals(s2))
		  {
			System.out.println("Congrats");	
		  } 
		else
		  {
		    System.out.println("Name Does Not Match");
		  }
	   }
}