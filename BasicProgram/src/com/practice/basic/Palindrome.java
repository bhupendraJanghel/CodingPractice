package com.practice.basic;

import java.util.Scanner;

public class Palindrome {

	public static void checkPallindrome(int num) {
		int rem;
		int result=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			result=result*10+rem;        //main logic
			num=num/10;
		}
		if(temp==result)
			System.out.println("Pallindrome number");
		else
			System.out.println("Not a Pallindrome number");
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		checkPallindrome(num);
		sc.close();
	}

}
