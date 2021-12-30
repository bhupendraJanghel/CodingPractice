package com.creational.abstractFactory;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {

		if (typeOfProfession == null)
			return null;
		else if (typeOfProfession.equalsIgnoreCase("engineer"))
			return new Engineer();
		else if (typeOfProfession.equalsIgnoreCase("teacher"))
			return new Teacher();
		else
			return null;
	}

}
