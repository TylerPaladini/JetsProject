package com.skilldistillery.jets;

import java.util.Arrays;
import java.util.Scanner;


public class Airfield {

	private Jet[] jets;
	private int numJets = 7;

	private final int MAX_JETS = 20;

	CargoPlane cargo = new CargoPlane();
	FighterJet fighter = new FighterJet();
	JetImpl newJet = new JetImpl(); // added for adding a jet???
	Bombers bomber = new Bombers();

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
	
	public void loadCargo () {
        for (Jet jet : jets) {
            if ( jet != null ) {
                if ( jet instanceof  CargoCarrier ) {
                    System.out.println( jet.getPlaneModel() );
                     cargo.loadCargo();
                }
            }
        }
    }
	
	public void fight () {
        for (Jet jet : jets) {
            if ( jet != null ) {
                if ( jet instanceof FighterJet ) {
                    System.out.println( jet.getPlaneModel() );
                    fighter.fight();
                }
            }
        }
    }
	
	public void dropBombs() {
		for (Jet jet : jets) {
			if( jet != null) {
				if ( jet instanceof Bombers) {
					System.out.println(jet.getPlaneModel());
					bomber.dropBombs();
				}
			}
			
		}
	}
	
	public int addJet () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter jet model(no spaces): ");
        String name = keyboard.next();
        System.out.println("Enter your jets speed(in mph): ");
        double speed = keyboard.nextDouble();
        System.out.println("Enter your jets range(in miles): ");
        double range = keyboard.nextDouble();
        System.out.println("Enter your jets price(in millions): ");
        double price = keyboard.nextDouble();
        price = price * 000001;
        System.out.println("Enter your jets fuel capacity( in gallons):");
        double fuel = keyboard.nextDouble();
        menu();
        System.out.println("Make another selection");
        int input = keyboard.nextInt();
        
        for ( int i = 7; i < jets.length ; i ++) {
            if ( jets[i] == null ) {
                jets[i] = new JetImpl(name, speed, range, price, fuel );
                return input;
            }
        }
        
    
            
        keyboard.close();
        return 0;
        
        
        
    }
	
	public void menu() {
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all cargo jets");
		System.out.println("6: Dogfight");
		System.out.println("7: Srop bombs");
		System.out.println("8: Add a jet to the fleet");
		System.out.println("9: Quit");
		System.out.println();
	}
	
	
	

}
