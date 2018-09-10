package com.skilldistillery.jets;

public class FighterJet extends Jet implements CargoCarrier, CombatReady{

public FighterJet() {
	
}

	public FighterJet(String planeModel, double speedMph, int range, double price, double fuelCapacity) {
		super(planeModel, speedMph, range, price, fuelCapacity);
	}



	@Override
	public void getSpeedInMach() {

	}

	@Override
	public String toString() {
		return super.toString();
	}


	@Override
	public void fight() {
		System.out.println("Get ready to fight!!");
		
	}


	public void loadCargo() {
		
	}

}
