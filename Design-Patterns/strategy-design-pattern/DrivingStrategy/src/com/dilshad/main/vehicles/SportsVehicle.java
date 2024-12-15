package com.dilshad.main.vehicles;

import com.dilshad.main.strategies.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle
{

	public SportsVehicle() {
		super(new SpecialDriveStrategy());
	}

}
