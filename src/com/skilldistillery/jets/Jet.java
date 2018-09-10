package com.skilldistillery.jets;

public abstract class Jet {
	private String planeModel;
	private double speedMph;
	private int range;
	private double price;
	private double fuelCapacity;
	
	public Jet() {
		
	}


	public Jet(String planeModel, double speedMph, int range, double price, double fuelCapacity) {
		super();
		this.planeModel = planeModel;
		this.speedMph = speedMph;
		this.range = range;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
	}

	public void fly() {
		double time = range / speedMph;
		System.out.println(planeModel + speedMph + range + price + fuelCapacity + time);
		System.out.println("-----------------------------------");
	}

	public abstract void getSpeedInMach();

	public String getPlaneModel() {
		return planeModel;
	}

	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public double getSpeedMph() {
		return speedMph;
	}

	public void setSpeedMph(double speedMph) {
		this.speedMph = speedMph;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	

	@Override
	public String toString() {
		return "Plane: " + planeModel + ", Speed: " + speedMph + " mph, Range: " + range + " miles, Price: " + price
				+ ", Fuel: " + fuelCapacity + " gallons";
	}

	

	

	
	
	

}
