package com.practice.searching;


import java.util.Scanner;

public class BinarySearch {

	private static void binarySrch(int[] list,int val) {
		int minIndex = 0;
		int maxIndex = list.length;
		int midIndex ;
		while(minIndex<=maxIndex) {
			midIndex = (minIndex + maxIndex)/2;
			if(val == list[midIndex]) {
				System.out.println("Value is found at "+(midIndex+1)+" position");
				break;
			}
			if(val > list[midIndex]) {
				minIndex = midIndex  + 1;
			}else {
				maxIndex = midIndex -1;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int list[] = {1,2,3,4,5,6,7,8,9,10}; //list must be in sorted order to perform BinarySearch
		int val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to find the position:");
		val=sc.nextInt();
		
		binarySrch(list,val);
		sc.close();

	}

}
