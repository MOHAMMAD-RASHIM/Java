package com.dsa.maths;

import java.util.Scanner;



/*
 * TIME COMPLEXITY: O(log(n))
 */

public class GCD_Optimized_Euclid {
	
	static int gcd(int a,int b)
	{
		while(a!=0 && b!=0)
		{
			if(a>b)
			{
				a = a%b;
			}
			else
			{
				b = b%a;
			}
		}
		return a+b;
		
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = gcd(a,b);
		System.out.println(result);

	}

}
