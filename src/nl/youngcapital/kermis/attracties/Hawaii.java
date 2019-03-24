package nl.youngcapital.kermis.attracties;


public class Hawaii extends RisicoRijkeAttractie{
	public Hawaii(){
	   super("Hawaii", 2.90);
	   this.draaiLimiet = 5; 
	   this.rondesSindsLaatsteKeuring = 0;
   }
	public void opstellingsKeuring(){
		this.rondesSindsLaatsteKeuring = 0;
	}
}
