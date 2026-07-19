package com.dsa.maths;
import java.util.Scanner;


/*
 * LCM(a,b) = (a*b)/GCD(a,b)
 * 
 *	TIME COMPLEXITY: O(log N)
 *	N = min(a,b)
 */

public class LCM_optimized {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter number2: ");
		int num2 = scanner.nextInt();
		
		findLCM(num1,num2);

	}

	private static void findLCM(int num1, int num2) {
		int res = (num1*num2)/GCD_Optimized_Euclid.gcd(num1, num2);
		System.out.println(res);
		
	}

}
