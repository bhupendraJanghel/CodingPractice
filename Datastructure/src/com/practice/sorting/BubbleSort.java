package com.practice.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	private static void bubbleSort(int[] list) {
		
		for(int i=0;i<list.length-1;i++) {
			boolean swapped = false;                      //optimized bubble sort
			for(int j=0;j<list.length-i-1;j++) {
				
				if(list[j]>list[j+1]) { //swapping
					int tmp = list[j];
					list[j]= list[j+1];
					list[j+1]=tmp;
					swapped=true;
				}
			}
			if(!swapped) {  //if there is no swapping in the entire iteration
				break;
			}
		}
	}


	public static void main(String[] args) {

		int list[] = {12,23,-43,1,2,-3,5,-6};
		System.out.println("Sorted Array:");
		bubbleSort(list);
		System.out.println(Arrays.toString(list));

	}

}

/* (n - 1) + (n - 2) + (n - 3) +.....+ 1 = n(n - 1) / 2 
 * 
 * Complexity : O(n2)
 * 
 * 
 * Space complexity : O(2)  as 2 variable are used : tmp, swapped
 * */
