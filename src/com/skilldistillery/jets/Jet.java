package com.skilldistillery.jets;

public abstract class Jet {
	private String planeModel;
	private double speedMph;
	private int range;
	private long price;
	private double fuelCapacity;

//	public Jet(String model, double speedMph, int range, long price) {
//		this(model, speedMph, range, price, 0.0);
//	}  do i need this..........................................

	public Jet(String planeModel, double speedMph, int range, long price, double fuelCapacity) {
		super();
		this.planeModel = planeModel;
		this.speedMph = speedMph;
		this.range = range;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
	}

	public abstract void fly();

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
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
		return "Jet [planeModel=" + planeModel + ", speedMph=" + speedMph + ", range=" + range + ", price=" + price
				+ ", fuelCapacity=" + fuelCapacity + ", toString()=" + super.toString() + "]";
	}

}
