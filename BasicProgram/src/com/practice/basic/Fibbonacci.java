package com.practice.basic;

import java.util.Scanner;

public class Fibbonacci {
public static void printFibonacci(int n) {
		
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<n;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static int resursiveFibonacci(int n) {
		if(n<=1)
			return n;
		return resursiveFibonacci(n-1) + resursiveFibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		printFibonacci(n);
		//System.out.println(resursiveFibonacci(n));
		sc.close();
		
	}

}
