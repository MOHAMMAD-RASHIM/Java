package com.dsa.maths;

import java.util.Scanner;

public class Euclid_GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
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
		System.out.print(a);
			
	}

}
