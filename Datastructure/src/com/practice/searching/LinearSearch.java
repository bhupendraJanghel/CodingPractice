package com.practice.searching;

import java.util.Scanner;

public class LinearSearch {

	private static int linearSrch(int list[],int val) {
		
		for(int i=0;i<list.length;i++) {
			if(list[i]==val) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int list[] = {12,23,43,1,2,3,5,6};
		int val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to find the position:");
		val=sc.nextInt();
		
		int result=linearSrch(list,val);
		if(result==-1) {
			System.out.println("not found");
		}else {
			System.out.println("Value is found at "+(result+1)+" position");
		}
		sc.close();
	}

}
