package nl.youngcapital.kermis.attracties;


public class Spin extends RisicoRijkeAttractie {
   public Spin() {
      super("Spin", 2.25);
      super.draaiLimiet = 10;
      super.rondesGedraaid = 0;
   }
}
