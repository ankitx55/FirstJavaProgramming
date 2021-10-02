package Prog;

import java.util.Scanner;

public class Four {
	public static void main(String args[])
	{
		//Sum of two numbers.
		
		System.out.println("Enter the first number");
		Scanner input= new Scanner(System.in);
		int num1= input.nextInt();
		
		
		
		System.out.println("Enter the second numner");
		int num2 = input.nextInt();
		
		System.out.printf("The sum is : %d",num1+num2);
	}
}