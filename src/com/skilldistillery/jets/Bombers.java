package com.skilldistillery.jets;

public class Bombers extends Jet {
	private String bombType;
	private int bombAmount;
	
	public Bombers() {
		
	}

	

	public Bombers(String planeModel, double speedMph, int range, double price, double fuelCapacity) {
		super(planeModel, speedMph, range, price, fuelCapacity);
	}

	
	


	@Override
	public void getSpeedInMach() {

	}

	public String getBombType() {
		return bombType;
	}

	public void setBombType(String bombType) {
		this.bombType = bombType;
	}

	public int getBombAmount() {
		return bombAmount;
	}

	public void setBombAmount(int bombAmount) {
		this.bombAmount = bombAmount;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	public void dropBombs() {
		System.out.println("BOOM BOOM BOOM BOOM");
	}

}
