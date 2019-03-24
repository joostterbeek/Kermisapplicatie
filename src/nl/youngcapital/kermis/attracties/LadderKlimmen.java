package nl.youngcapital.kermis.attracties;


public class LadderKlimmen extends Attractie implements GokAttractie{
	public double kansSpelBelasting;
   public LadderKlimmen() {
	   super("Ladderklimmen", 5.00);
   }
   public double kansSpelBelastingBetalen() {
	  kansSpelBelasting = (((double)super.kaartjes) * super.prijs)*procent;
	  return kansSpelBelasting;
   }
}
