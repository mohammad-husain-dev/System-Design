package com.dilshad.main.vehicles;

import com.dilshad.main.strategies.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle
{
	public OffroadVehicle() {
		super(new SpecialDriveStrategy());
	}
}
