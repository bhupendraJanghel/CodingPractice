package com.practice.basic;

import java.util.Scanner;

public class Armstrong {
	
	private static void checkArmstrong(int num) {
		int rem,result=0;
		int temp=num;
		
		while(num!=0) {
			rem=num%10;
			result=(int) (result + Math.pow(rem,3));
			num=num/10;
		}
		if(result==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		checkArmstrong(num);
		sc.close();
		
	}

}
