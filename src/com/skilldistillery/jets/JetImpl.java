package com.skilldistillery.jets;

public class JetImpl extends Jet {

	public JetImpl() {
	}

	public JetImpl(String planeModel, double speedMph, int range, long price, double fuelCapacity) {
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
		return "JetImpl [getPlaneModel()=" + getPlaneModel() + ", getSpeedMph()=" + getSpeedMph() + ", getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + ", getFuelCapacity()=" + getFuelCapacity()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
