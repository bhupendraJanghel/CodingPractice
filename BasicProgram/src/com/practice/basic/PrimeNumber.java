package com.practice.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void checkPrime(int num) {
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {       // i<=num/2 remember this
			if(num%i==0){
				flag=true;
				break;
			}
		}
		if(flag) 
			System.out.println("Not a prime number");
		else
			System.out.println("Prime Number");
	}
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		checkPrime(num);
		sc.close();
	}
}
