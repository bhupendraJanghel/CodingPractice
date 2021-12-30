package com.creational.singleton;

public class MaiinClass {

	public static void main(String[] args) {
	
		SingletonClass obj = SingletonClass.getInstance();
		obj.simpleMethod();
		
		SingletonClass obj2 = SingletonClass.getInstance();
		
		obj2.simpleMethod();
		
	}

}
