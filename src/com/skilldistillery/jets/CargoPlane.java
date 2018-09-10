package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier, CombatReady {
	

	public CargoPlane() {
		
	}

	public CargoPlane(String planeModel, double speedMph, int range, double price, double fuelCapacity) {
		super(planeModel, speedMph, range, price, fuelCapacity);
	}




	@Override
	public void getSpeedInMach() {

	}

	public void loadCargo() {
		System.out.println("Load it up!!!");

	}

	public void heavyLifter() {
		System.out.println("I'm a heavy lifter!!!");
	}



	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void fight() {
		
	}
}
