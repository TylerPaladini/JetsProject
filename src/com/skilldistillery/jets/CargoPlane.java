package com.skilldistillery.jets;

public class CargoPlane extends Jet {

	public CargoPlane() {
	}

	public CargoPlane(String planeModel, double speedMph, int range, long price, double fuelCapacity) {
		super(planeModel, speedMph, range, price, fuelCapacity);
	}

	@Override
	public void fly() {

	}

	@Override
	public void getSpeedInMach() {

	}

	public void loadCargo() {

	}

	public void heavyLifter() {
		System.out.println("I'm a heavy lifter!!!");
	}

	@Override
	public String toString() {
		return "CargoPlane [getPlaneModel()=" + getPlaneModel() + ", getSpeedMph()=" + getSpeedMph() + ", getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + ", getFuelCapacity()=" + getFuelCapacity()
				+ ", toString()=" + super.toString() + "]";
	}
}
