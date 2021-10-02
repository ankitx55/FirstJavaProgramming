package Prog;

import java.util.Scanner;

public class Six {
	public static void main(String[] args)
	{
		int sum=0;
		//to find the sum of N numbers;
		System.out.println("Enter the the value of N: ");
		Scanner in= new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=1; i<num; i++)
		{
			System.out.print(sum+" + "+i+" = ");
			sum=sum+i;
			System.out.println(sum);
		}
		System.out.print("Sum of " +num+" numbers is : "+sum);
	}
}