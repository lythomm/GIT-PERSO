
public class Colis extends ObjetPostaux {

	private double TarifBase;
	private String Contenu;
	private double ValeurDéclarée;
	
	public Colis(String origine, String destination, int CodePostal, int Poids, int Volume, float TauxRecommandation, int TarifBase
			,String Contenu, double ValeurDéclarée) {
		super(origine, destination, CodePostal, Poids, Volume, TauxRecommandation);
		this.TarifBase = 2.0;
		this.ValeurDéclarée = ValeurDéclarée;
		this.Contenu = Contenu;
	}
	
	@Override
	public double TarifAffranchissement() {
		if ( this.getTauxRecommandation() == 2 ) {
			return this.TarifBase += 1.5;
		} else if ( this.getVolume() > 1/8) {
			return this.TarifBase += 3;
		}
		return this.TarifBase;
	}
	
	 @Override
	 public double TarifRemboursement() {
		 double Remboursement = 0.0;
		 if ( this.getTauxRecommandation() == 1) {
			 Remboursement += (this.ValeurDéclarée * 10) / 100;
		 } else if (this.getTauxRecommandation() == 2) {
			 Remboursement += (this.ValeurDéclarée * 50) / 100;
		 } else {
			 Remboursement = 0;
		 }
		 return Remboursement;
	 }
	
	 @Override
	 public String toString() {
		 return ("Colis [ "+this.getCodePostal()+" / "+this.getDestination()+" / "+this.getTauxRecommandation()+" / "+this.getVolume()+" / "
		 		+ this.ValeurDéclarée);
	 }
	 
}
