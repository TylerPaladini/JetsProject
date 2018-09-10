package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	Airfield airfield = new Airfield();

	public static void main(String[] args) {
		JetApp jetApp = new JetApp();

		jetApp.run();

	}

	public void run() {

		Jet[] jets = new Jet[20];

		Jet jet1 = new FighterJet("Sukhoi Su-35", 1_490, 2_240, 39_000_000, 25_400);
		Jet jet2 = new FighterJet("A-10 Thunderbolt II", 439, 2_580, 18_800_000, 11_000);
		Jet jet3 = new FighterJet("Curtiss P-40 Warhawk", 378, 240, 44_892, 134);
		Jet jet4 = new CargoPlane("Antonov An-225 Mriya", 528, 9_569, 250_000_000, 661_000);
		Jet jet5 = new CargoPlane("Boeing C-17 Globemaster III", 515, 2_785, 218_000_000, 35_546);
		Jet jet6 = new Bombers("Northrup Grumman B-2 Spirit", 630, 6_900, 737_000_000, 167_000);
		Jet jet7 = new Bombers("Tupolev Tu-95", 575, 9_400, 26_000_000, 29_100);

		jets[0] = jet1;
		jets[1] = jet2;
		jets[2] = jet3;
		jets[3] = jet4;
		jets[4] = jet5;
		jets[5] = jet6;
		jets[6] = jet7;
		airfield.setJets(jets);

		airfield.listFleet();
		System.out.println();
		displayMenu();
		System.out.println();

	}

	public void displayMenu() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println();
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all cargo jets");
		System.out.println("6: Dogfight");
		System.out.println("7: Drop bombs");
		System.out.println("8: Add a jet to the fleet");
		System.out.println("9: Quit");
		System.out.println();

		int choice = keyboard.nextInt();

		while (choice != 10) {
			switch (choice) {
			case 1:
				airfield.listFleet();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 2:
				airfield.displayFly();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 3:
				airfield.findFastest();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 4:
				airfield.longestRange();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 5:
				airfield.loadCargo();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 6:
				airfield.fight();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 7:
				airfield.dropBombs();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 8:
				airfield.addJet();
				displayMenu();
				choice = keyboard.nextInt();
				break;
			case 9:
				System.out.println("I hope you enjoyed the airshow.");
				break;
			default:
				System.out.println("You must enter 1-9 please.");
				System.out.println("Make a selection.");
				choice = keyboard.nextInt();

			}
		}
	}

}
