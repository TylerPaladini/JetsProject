package com.skilldistillery.jets;


public class Airfield {
	
	private Jet[] jets;
	private int numJets = 0;

	public static final int MAX_JETS = 100;

	public Airfield() {
		jets = new Jet[MAX_JETS];
	}

	public void addJets(Jet j) {
		jets[numJets] = j;
		numJets++;

	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public int getNumJets() {
		return numJets;
	}

	public void setNumJets(int numJets) {
		this.numJets = numJets;
	}

	public void listFleet() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet.toString());
			}

		}

	}
	public void displayFly() {
		for (Jet jet : jets) {
			if( jet != null) {
				jet.fly();
			}
			
		}
	}

}
