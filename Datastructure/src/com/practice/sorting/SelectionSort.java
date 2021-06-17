package com.practice.sorting;
import java.util.Arrays;

public class SelectionSort {
	
	private static void selectionSort(int[] list) {
		
		for(int i=0;i<list.length-1;i++) {
			int min=i;
			for(int j =i+1;j<list.length;j++) {
				if(list[min]<list[j]) {
					min=j;
				}
			}
			int tmp=list[i];
			list[i]=list[min];
			list[min]=tmp;
		}
		
	}

	public static void main(String[] args) {
		
		int list[] = {12,23,-43,1,2,-3,5,-6};
		System.out.println("Sorted Array:");
		selectionSort(list);
		System.out.println(Arrays.toString(list));


	}

}

/*
 * Selection sort is an algorithm that selects the smallest element from an
 * unsorted list in each iteration and places that element at the beginning of
 * the unsorted list.
 * 
 * 
 * Complexity : O(n2)
 * 
 * 
 * Space complexity : O(1)
 */
