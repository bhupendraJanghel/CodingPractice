package com.creational.builder;

public class FloodResistantBuilder implements Builder{

	private Home floodResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feet above ground level floor";
	}

	@Override
	public void buildWalls() {
		floodResistantHome.walls = "water resistance walls";
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "water leakage resistant terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		// TODO Auto-generated method stub
		return floodResistantHome;
	}

}
