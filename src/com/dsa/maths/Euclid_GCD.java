package com.dsa.maths;

import java.util.Scanner;

public class Euclid_GCD {
	
	public static int gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a = a-b;
			}
			else
			{
				b = b-a;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = gcd(a,b);
		System.out.println(result);
	}

}
