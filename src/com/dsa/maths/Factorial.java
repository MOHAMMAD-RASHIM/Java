package com.dsa.maths;

import java.util.Scanner;

/*
 * PROGRAM to find factorial of a number
 * 
 * Input: 5 
 * Output: 120  [1*2*3*4*5]
 */

public class Factorial
{
	static int factorial(int num)
	{
		int result = 1;
		for(int i=1;i<=num;i++)
		{
			result = result * i;
		}
		return result;
	}
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to find factorial: ");
		int number = scanner.nextInt();
		
		System.out.println(factorial(number));
		
		scanner.close();
		
	}

}
