package com.practice.basic;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	public static boolean isPrime(int num) {
//		boolean flag=false;
//		for(int i=2;i<=num/2;i++) {       // i<=num/2 remember this
//			if(num%i==0){
//				flag=true;
//				break;
//			}
//		}
//		if(flag) 
//			return false;
//		else
//			return true;
		
		return num>1 && IntStream.range(2, num).noneMatch(e -> num%e == 0);  //using stream api
	}
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		System.out.println(isPrime(num));
		
		//squareroot of 10 prime
		
		List<Double> sqrt10Prime = Stream.iterate(1, i->i+1).filter(PrimeNumber::isPrime).map(Math::sqrt).limit(10).collect(Collectors.toList());
		System.out.println(sqrt10Prime);
		sc.close();
	}
}
