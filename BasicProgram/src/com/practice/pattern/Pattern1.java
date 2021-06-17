package com.practice.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		System.out.println("enter n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			
			System.out.println("");
			
		}
		sc.close();
	}
}
