package com.creational.factory;

public class FactoryPatternMain {

	public static void main(String str[]) {
		
		ProfessionFactory professionFactory =new ProfessionFactory();
		
		Profession eng = professionFactory.getProfession("Engineer");
		
		eng.printt();
	}
}
