package com.dilshad.main.vehicles;

import com.dilshad.main.strategies.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle
{

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}
}
