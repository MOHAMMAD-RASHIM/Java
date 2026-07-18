package com.dsa.maths;

import java.util.Scanner;

/*
 * TIME COMPLEXITY: O(MIN(a,b))
 */

/*
 * Program to find the gcd or hcf of 2 numbers
 * eg: 9 6
 * factors of 9: 1,3,9
 * factors of 6: 1,3,6
 * GCD=3
 */
public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int minimum = Math.min(number1, number2);
		
		for(int i=minimum;i>=1;i--)
		{
			if(number1%i==0 && number2%i==0)
			{
				System.out.println("GCD of "+number1+" and "+number2+" is: "+i);
				break;
			}
		}
		
		

	}

}
