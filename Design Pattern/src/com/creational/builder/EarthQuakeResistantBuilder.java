package com.creational.builder;

public class EarthQuakeResistantBuilder  implements Builder{

	private Home earthQuakeResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		this.earthQuakeResistantHome.floor = "Wooden Floor";
		
	}

	@Override
	public void buildWalls() {
		this.earthQuakeResistantHome.walls = "Wooden Walls";
		
	}

	@Override
	public void buildTerrace() {
		this.earthQuakeResistantHome.terrace = "Wooden terrace";
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthQuakeResistantHome;
	}

}
