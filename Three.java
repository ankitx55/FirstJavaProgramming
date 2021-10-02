package Prog;

import java.util.Scanner;

public class Three
{
	public static void main(String args[])
	{
		
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("please enter the first number");
		
		int num1=number.nextInt();
		
		
		System.out.println("please enter the second number");
		
		int num2=number.nextInt();
		
		//Different ways to print more than one variable in a single println command.
		
		
		System.out.println(num1+" "+num2);
		
		System.out.println("\n" +num1+"\n" +num2);
		
		System.out.print("\n" +num1+"\n" +num2);
	}
}