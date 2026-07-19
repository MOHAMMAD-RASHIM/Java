package com.dsa.maths;

import java.util.Scanner;

public class Prime_Number_approach2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		
		if(isPrime(num))
		{
			System.out.println(num+" is Prime");
		}
		else {
			System.out.println(num+" is NOT Prime");
		}
	}

	private static boolean isPrime(long num) {
		if(num<=1) return false;
		for(int i=2;i*i<=num;i++)  // or i<=Math.sqrt(num)
		{
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
