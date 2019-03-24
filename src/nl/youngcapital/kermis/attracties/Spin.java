package nl.youngcapital.kermis.attracties;


public class Spin extends RisicoRijkeAttractie {
   public Spin() {
      super("Spin", 2.25);
      this.draaiLimiet = 10;
      this.rondesSindsLaatsteKeuring = 0;
   }
   public void opstellingsKeuring() {
	   this.rondesSindsLaatsteKeuring = 0;
   }
}
