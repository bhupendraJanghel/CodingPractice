package com.practice.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	private static void insertionSort(int[] list) {
		
		for(int i=1;i<list.length;i++) {
			int key=list[i];
			
			int j=i-1;
			while(j>=0 && key<list[j]) {
				list[j+1]=list[j];
				--j;
			}
			list[j+1]=key;
			
		}
	}

	public static void main(String[] args) {
		
		int list[] = {5,4,3,6,7,1,2};
		System.out.println("Sorted Array:::");
		insertionSort(list);
		System.out.println(Arrays.toString(list));

	}

}
/*
 * Insertion sort works similarly as we sort cards in our hand in a card game.
 * 
 * We assume that the first card is already sorted then, we select an unsorted
 * card. If the unsorted card is greater than the card in hand, it is placed on
 * the right otherwise, to the left. In the same way, other unsorted cards are
 * taken and put at their right place.
 * 
 * 
 * 
 *  * Complexity : O(n2)
 * 
 * 
 * Space complexity : O(1)   : key
 */