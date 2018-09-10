package com.skilldistillery.jets;

import java.util.Arrays;

public class Airfield {

	private Jet[] jets;
	private int numJets = 7;

	private final int MAX_JETS = 20;

//	CargoPlane cargo = new CargoPlane();
//	FighterJet fighter = new FighterJet();

	public Airfield() {
		jets = new Jet[MAX_JETS];
	}
	 
	public Airfield(Jet[] jets) {
		this.jets = jets;
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

//	public int getNumJets() {
//		return numJets;
//	}

//	public void setNumJets(int numJets) {
//		this.numJets = numJets;
//	}

	public void listFleet() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet.toString());
			}

		}

	}

	public void displayFly() {
		for (Jet jet : jets) {
			if (jet != null) {
				jet.fly();
			}

		}
	}

	public void findFastest() {
		double fast = jets[0].getSpeedMph();
		String fastJet = jets[0].getPlaneModel();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeedMph() > fast) {
					fast = jets[i].getSpeedMph();
					fastJet = jets[i].getPlaneModel();
				}
			}

		}

		System.out.println("The fastest jet is " + fastJet);
		System.out.println("It can go " + fast + " mph");

	}

	public void longestRange() {
			double range = jets[0].getRange();
			String fastJet = jets[0].getPlaneModel();
			for (int i = 0; i < jets.length; i++) {
				if(jets[i] != null) {
					if(jets[i].getSpeedMph() > range) {
						range = jets[i].getRange();
						fastJet = jets[i].getPlaneModel();				}
				}
				
				
			}
			System.out.println("The jet with the longest range is " + fastJet);
			System.out.println("It can go " + range + " miles");
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(jets);
		result = prime * result + numJets;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airfield other = (Airfield) obj;
		if (!Arrays.equals(jets, other.jets))
			return false;
		if (numJets != other.numJets)
			return false;
		return true;
	}
	
	
	

}
