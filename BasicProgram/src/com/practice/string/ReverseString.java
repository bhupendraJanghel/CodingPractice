package com.practice.string;

public class ReverseString {
	public static String reverseString(String str) {

		char reverse[] = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse[i] = str.charAt(j);
			j++;

		}
		return String.valueOf(reverse);
	}

	public static void main(String arg[]) {

		String str = "world";

		System.out.println(reverseString(str));
	}
}
