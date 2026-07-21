package com.dsa.maths;

import java.util.Scanner;

public class Prime_numbers_from_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
				

	}

}
