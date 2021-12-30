package com.creational.abstractFactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null)
			return null;
		else if (typeOfProfession.equalsIgnoreCase("TraineeEngineer"))
			return new TraineeEngineer();
		else if (typeOfProfession.equalsIgnoreCase("TraineeTeacher"))
			return new TraineeTeacher();
		else
			return null;
	}

}
