package com.practice.array;

//Find the maximum and minimum element in an array

public class Problem6 {

	static class Pair {
		int min;
		int max;
	}

	static Pair getMinMax(int ar[]) {

		Pair minMax = new Pair();

		// if there is only one element
		if (ar.length == 1) {
			minMax.min = minMax.max = ar[0];
			return minMax;
		}

		//if there is more than  one element	
		if (ar[0] > ar[1]) {
			minMax.min = ar[1];
			minMax.max = ar[0];
		} else {
			minMax.min = ar[0];
			minMax.max = ar[1];
		}

		for (int value : ar) {
			if (value < minMax.min)
				minMax.min = value;
			else if (value > minMax.max)
				minMax.max = value;
		}
		return minMax;
	}

	public static void main(String[] args) {

		int arr[] = { 1000, 11, 445, 1, 330, 3000};

		// using StreamApi
		// int max = Arrays.stream(arr).max().orElseThrow();
		// System.out.println(max);

		Pair result = getMinMax(arr);
		System.out.println("min :" + result.min);
		System.out.println("max :" + result.max);
	}

}
