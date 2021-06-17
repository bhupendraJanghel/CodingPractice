package com.practice.basic;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		int min=3;
		int max=16;
		Random rand=new Random();
		// Generate random integers in range 0 to 10
		//System.out.println(rand.nextInt(10));
		
		
		System.out.println((int) ((Math.random() * (max - min)) + min));
		
	}

}
