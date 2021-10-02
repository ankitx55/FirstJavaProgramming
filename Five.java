package Prog;
import java.util.Scanner;

public class Five 
{
	public static void main(String[] args)
	{
		
		//to find the factorial of a number
		
		System.out.println("Enter any number");
		
		Scanner in = new Scanner(System.in);
		
		
		
		int num= in.nextInt();
		
		int i, fact=1;
		
		
		for(i=1; i<=num; i++)
		{
			System.out.print(i+" x "+fact);
			
			fact=fact*i;
			
			System.out.println(" = " +fact);
			
		}
		
		
		System.out.println("\n\nThe factorial of "+num+" is : "+fact);
	}
}
