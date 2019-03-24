package nl.youngcapital.kermis.attracties;

public class Attractie {

   public String attractieNaam;
   public double prijs;
   public int oppervlakte;
   public double opbrengst;
   public int kaartjes;

   public Attractie() {
   }
   
   public Attractie(String attractieNaam, double price) {
     this.attractieNaam = attractieNaam;
     this.prijs = price;
   }

   public void attractieDraaien() {
      System.out.println("De attractie " + attractieNaam + " draait!");
      opbrengst += prijs;
      kaartjes = kaartjes++;
   }
   
   
}


