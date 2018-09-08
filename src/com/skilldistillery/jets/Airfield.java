package com.skilldistillery.jets;

public class Airfield {
	private Jet[] jets;	
	private int numJets = 0;
	
	public static final int MAX_JETS = 100;
	

	public Airfield() {
		jets = new Jet[MAX_JETS];
	}
	


	public Airfield(Jet[] jets, int numJets) {
		super();
		this.jets = jets;
		this.numJets = numJets;
	}

	public void addJets(Jet j) {
		jets[numJets] = j;
		numJets++;
		
	}

}
