package com.creational.abstractFactory;

public class FactoryPatternMainClass {

	public static void main(String strp[]) {
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		Profession engg= abstractFactory.getProfession("TraineeEngineer");
		engg.printt();
				
	}
}
