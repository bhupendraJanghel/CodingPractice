package com.practice.string;

public class StringContainsVowels {
	public static void main(String[] args) {

		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

	}

	private static boolean stringContainsVowels(String string) {
		return string.toLowerCase().matches(".*[aeiou].*");
	}

}
