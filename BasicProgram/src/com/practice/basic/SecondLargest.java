package com.practice.basic;

public class SecondLargest {

	public static void secondLargest(int[] ar) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > largest) {
				secondLargest = largest;
				largest = ar[i];

			} else if (ar[i] > secondLargest && ar[i] != largest)
				secondLargest = ar[i];
		}
		System.out.println("Second Largest value :" + secondLargest);
	}

	public static void main(String[] args) {

		int arr[] = { 12, 3, 53, 35, 5, 43, -32, 4, 2, 420, 3, 435 };

		secondLargest(arr);

	}

}
