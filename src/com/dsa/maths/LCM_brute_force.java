package com.dsa.maths;

import java.util.Scanner;

/*
 * LCM IS LEAST COMMON MULTIPLE OF 2 NUMBERS
 	
 	EXAMPLE 2 AND 5
 	MULTIPLES OF 2 ARE: 2 4 6 8 10 12 14 16 18 20 22......
 	MULTIPLES OF 5 ARE: 5 10 15 20 25 30......
 	
 	COMMON MULTIPLES OF 2&5 ARE: 10,20,30.....
 	
 	LCM(2,5) IS 10
 	
 	
 	THIS IS BRUTE FORCE APPROACH 
 	
 	TIME COMPLEXITY O(A*B - MAX(A,B))
 */
public class LCM_brute_force {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter number2: ");
		int num2 = scanner.nextInt();
		
		findLCM(num1,num2);
	}

	private static void findLCM(int num1, int num2) {
		int res = Math.max(num1, num2);
		
		while(true)
		{
			if(res%num1==0 && res%num2==0)
			{
				break;
			}
			res++;
		}
		System.out.println(res);
		
	}

}
