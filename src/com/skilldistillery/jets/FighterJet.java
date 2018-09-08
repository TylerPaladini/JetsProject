package com.skilldistillery.jets;

public class FighterJet extends Jet {

	public FighterJet() {
		
	}

	public FighterJet(String planeModel, double speedMph, int range, long price, double fuelCapacity) {
		super(planeModel, speedMph, range, price, fuelCapacity);
	}

	@Override
	public void fly() {

	}

	@Override
	public void getSpeedInMach() {

	}

	@Override
	public String toString() {
		return "FighterJet [getPlaneModel()=" + getPlaneModel() + ", getSpeedMph()=" + getSpeedMph() + ", getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + ", getFuelCapacity()=" + getFuelCapacity()
				+ ", toString()=" + super.toString() + "]";
	}
	public void shooter() {
		System.out.println("PEW PEW PEW PEW");
	}

}
