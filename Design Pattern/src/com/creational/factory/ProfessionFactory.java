package com.creational.factory;

public class ProfessionFactory {

	public Profession getProfession(String profession) {

		if (profession == null)
			return null;
		if (profession == "Docter")
			return new Docter();
		if (profession == "Engineer")
			return new Engineer();
		if (profession == "Teacher")
			return new Teacher();
		return null;
	}
}
