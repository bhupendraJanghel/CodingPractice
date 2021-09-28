package com.practice.basic;

public class SecondLargest {

	public static int secondLargest(int[] ar) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > largest) {
				secondLargest = largest;
				largest = ar[i];

			} else if (ar[i] > secondLargest && ar[i] != largest)
				secondLargest = ar[i];
		}
		if(secondLargest<0) {
			return -1;
		}
		else
			return secondLargest;
	}

	public static void main(String[] args) {

		int arr[] = {2,1,2};

		System.out.println(secondLargest(arr));

	}

}
