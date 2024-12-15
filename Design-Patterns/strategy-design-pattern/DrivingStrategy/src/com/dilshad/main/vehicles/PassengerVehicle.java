package com.dilshad.main.vehicles;

import com.dilshad.main.strategies.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle
{
	public PassengerVehicle() {
		super(new NormalDriveStrategy());
	}
}
