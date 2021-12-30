package com.creational.builder;

public class MainClass {

	public static void main(String[] args) {

		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
	}

}
