package com.dsa.maths;

import java.util.Scanner;

/*
 * Program to find the trailing zeroes of a factorial of  number
 * 
 * Input: 10
 * Output:2  
 							[1*2*3*4*5*6*7*8*9*10]=3628800 #2 zeroes @ end 
 							
 							
 	Series Useful for this problem is: n/5 + n/25 + n/125 + .....
 	
 	No of trailing zeroes in a factorial of a number is nothing but no of 5's
 		
 												No. of 5's
 	example: 25! = 	 1*2*3*4*5  					1
 					*6*7*8*9*10						1 (10=5*2)
 					*11*12*13*14*15					1 (15=5*3)
 					*16*17*18*19*20					1 (20=5*4)
 					*21*22*23*24*25					2 (25 = 5*5)
 					
 					Therefore total no of trailing zeroes = 1+1+1+1+2 = 6
 					
condition: 

# numerator is a given number n
# denominator is a power of 5  
# series.... above

 while(numerator>=denominator)
 {
 	res = res + numerator/denominator;
 	denominator = denominator * 5;
 								
 */

public class TrailingZeroes {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		noOfTrailingZeroes(number);
	}

	private static void noOfTrailingZeroes(int number) {
		int result = 0;
		int powOf5 = 5;
		while(number >= powOf5)
		{
			result = result + (number/powOf5);
			powOf5 = powOf5*5;
		}
		System.out.print(result);
	}
}
