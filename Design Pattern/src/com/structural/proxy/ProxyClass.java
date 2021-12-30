package com.structural.proxy;

public class ProxyClass extends RealSubjectClass{

	public void method() {
		System.out.println("I am PRoxy, I will perform authentication and security checks");
		
		//logic to check if user is authentic or not. If yes than call real object
		System.out.println("Calling real method of real subject implementing class");
		super.method();
	}
	
}
