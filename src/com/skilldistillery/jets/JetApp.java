package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {

	public static void main(String[] args) {
		
		Jet jet1 = new Jet("Sukhoi Su-35", 1_490, 2_240, 39_062_500, 25_400);
		Jet jet2 = new Jet("A-10 Thunderbolt II", 439, 2_580,18_800_000, 11_000);
		Jet jet3 = new Jet("Curtiss P-40 Warhawk", 378, 240,  44_892, 134);
		Jet jet4 = new Jet("Antonov An-225 Mriya", 528, 9_569, 250_000_000, 661_000);
		Jet jet5 = new Jet("Boeing C-17 Globemaster III", 515, 2_785, 218_000_000, 35_546);
		Jet jet6 = new Jet("Northrup Grumman B-2 Spirit", 630, 6_900, 737_000_000, 167_000);
		Jet jet7 = new Jet("Tupolev Tu-95", 575, 9_400, 26_000_000, 29_100);
		

		Airfield airfield = new Airfield();
		
		airfield.addJets(jet1);
		airfield.addJets(jet2);
		airfield.addJets(jet3);
		airfield.addJets(jet4);
		airfield.addJets(jet5);
		airfield.addJets(jet6);
		airfield.addJets(jet7);
		

		dispayUserMenu();
	}

	private static void dispayUserMenu() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all cargo jets");
		System.out.println("6: Dogfight");
		System.out.println("7: Add a jet to the fleet");
		System.out.println("8: Quit");
		String choice = keyboard.next();
	}

	public static void launchJets() {

	}
}
