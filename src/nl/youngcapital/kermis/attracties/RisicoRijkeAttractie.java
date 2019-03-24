package nl.youngcapital.kermis.attracties;

public abstract class RisicoRijkeAttractie extends Attractie {
 	public int rondesSindsLaatsteKeuring;
 	public int draaiLimiet;
	RisicoRijkeAttractie(String attractieNaam, double price){
		super(attractieNaam, price);
	}
	public abstract void opstellingsKeuring();
}
