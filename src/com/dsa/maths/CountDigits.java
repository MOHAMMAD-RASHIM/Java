package com.dsa.maths;
import java.util.Scanner;
/*
 PROGRAM to count the number of digits in a number
 
 Input: 2569
 Output: 4
 */
public class CountDigits 
{
	public static int countDigits(int number)
	{
		int count = 0;
		while(number!=0)
		{
			number = number/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		System.out.println(countDigits(num));
	}
}
