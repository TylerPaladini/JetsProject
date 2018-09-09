package com.skilldistillery.jets;

public class FighterJet extends Jet implements CargoCarrier, CombatReady{

	

	public FighterJet(String planeModel, double speedMph, int range, double price, double fuelCapacity) {
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
		return super.toString();
	}
	public void shooter() {
		System.out.println("PEW PEW PEW PEW");
	}

	@Override
	public void fight() {
		System.out.println("Get ready to fight!!");
		
	}

	@Override
	public void loadCargo() {
		
	} /////don't think this should be with FihterJet.......?

}
