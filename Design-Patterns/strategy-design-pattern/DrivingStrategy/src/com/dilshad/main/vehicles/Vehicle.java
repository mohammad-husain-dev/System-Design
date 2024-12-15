package com.dilshad.main.vehicles;

import com.dilshad.main.strategies.DriveStrategy;

public class Vehicle 
{
	private DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}

	public void drive() 
	{
		driveStrategy.drive();
	}
}
