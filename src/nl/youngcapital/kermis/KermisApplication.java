package nl.youngcapital.kermis;
import java.util.Scanner;

import nl.youngcapital.kermis.attracties.*;

public class KermisApplication {

	public static void main(String[] args) {
		Kermis kermis = new Kermis();
		kermis.kermisDraaien();
		
}
}

class Kermis{
	Attractie botsautos = new Botsautos();
	Attractie spin = new Spin();
	Attractie spiegelpaleis = new Spiegelpaleis();
	Attractie spookhuis = new Spookhuis();
	Attractie hawaii = new Hawaii();
	Attractie ladderklimmen = new LadderKlimmen();
	Scanner scanner = new Scanner(System.in);
	double totaleopbrengst;
	int totaalaantalkaartjesverkocht;
	Kermis(){
	System.out.println("Toets 1 om de botsautos te laten draaien");
	System.out.println("Toets 2 om de spin te laten draaien");
	System.out.println("Toets 3 om het spiegelpaleis te laten draaien");
	System.out.println("Toets 4 om het spookhuis te laten draaien");
	System.out.println("Toets 5 om de hawaii attractie te laten draaien");
	System.out.println("Toets 6 om de ladderklimmenattractie te laten draaien");
	System.out.println("Toets o om de omzet van de kermis te zien.");
	System.out.println("Toets k om te zien hoeveel kaartjes er zijn verkocht.");
	System.out.println("Toets c om te checken hoeveel rondes de spin attractie heeft gedraaid sinds de vorige opstellingskeuring..");
	System.out.println("Toets s om een opstellingskeuring uit te voeren op de spin attractie.");
	}
	void kermisDraaien() {
		String invoer = scanner.next();
		for(int i = 0; i >= 0 ; i++) {
		if(invoer.equals("1")) {
			botsautos.attractieDraaien();
			botsautos.opbrengst = botsautos.opbrengst + botsautos.prijs;
			totaleopbrengst = totaleopbrengst + botsautos.prijs;
			botsautos.kaartjes++;
			totaalaantalkaartjesverkocht++;
			invoer = scanner.next();
		}
		if("2".equals(invoer)) {
			spin.attractieDraaien();
			spin.opbrengst = spin.opbrengst + spin.prijs;
			totaleopbrengst = totaleopbrengst + spin.prijs;
			spin.kaartjes++;
			totaalaantalkaartjesverkocht++;
			((RisicoRijkeAttractie)spin).rondesSindsLaatsteKeuring++;
			invoer = scanner.next();
		}
		if("3".equals(invoer)) {
			spiegelpaleis.attractieDraaien();
			spiegelpaleis.opbrengst = spiegelpaleis.opbrengst + spiegelpaleis.prijs;
			totaleopbrengst = totaleopbrengst + spiegelpaleis.prijs;
			spiegelpaleis.kaartjes++;
			totaalaantalkaartjesverkocht++;
			invoer = scanner.next();
		}
		if("4".equals(invoer)) {
			spookhuis.attractieDraaien();
			spookhuis.opbrengst = spookhuis.opbrengst + spookhuis.prijs;
			totaleopbrengst = totaleopbrengst + spookhuis.prijs;
			spookhuis.kaartjes++;
			totaalaantalkaartjesverkocht++;
			invoer = scanner.next();
		}
		if("5".equals(invoer)) {
			hawaii.attractieDraaien();
			hawaii.opbrengst = hawaii.opbrengst + hawaii.prijs;
			totaleopbrengst = totaleopbrengst + hawaii.prijs;
			hawaii.kaartjes++;
			totaalaantalkaartjesverkocht++;
			invoer = scanner.next();
		}
		if("6".equals(invoer)) {
			ladderklimmen.attractieDraaien();
			ladderklimmen.opbrengst = ladderklimmen.opbrengst + ladderklimmen.prijs;
			totaleopbrengst = totaleopbrengst + ladderklimmen.prijs;
			ladderklimmen.kaartjes++;
			totaalaantalkaartjesverkocht++;
			invoer = scanner.next();
		}
		if("o".equals(invoer)) {
			System.out.println("De totale omzet is: " + totaleopbrengst + " euro.");
			invoer = scanner.next();
		}
		if("k".equals(invoer)) {
			System.out.println("Er zijn " + totaalaantalkaartjesverkocht + " kaartjes verkocht.");
			invoer = scanner.next();
		}
		if("c".equals(invoer)) {
			System.out.println("De Spin heeft " + ((RisicoRijkeAttractie)spin).rondesSindsLaatsteKeuring + " rondes gedraaid sinds opstellingskeuring.");
			invoer = scanner.next();
		}
		if("s".equals(invoer)) {
			((RisicoRijkeAttractie)spin).opstellingsKeuring();
			System.out.println("De spin is gekeurd.");
			System.out.println("De spin heeft " + ((RisicoRijkeAttractie)spin).rondesSindsLaatsteKeuring + " rondes gedraaid sinds opstellingskeuring.");
			invoer = scanner.next();
		}
	}
	System.out.println("De kermis is afgelopen");
}
}