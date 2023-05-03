
public class Lettre extends ObjetPostaux{

	private double TarifBase;
	private String Caract�reUrgence;
	
	public Lettre(String origine, String destination, int CodePostal, int Poids, int Volume, float TauxRecommandation, int TarifBase) {
		super(origine, destination, CodePostal, Poids, Volume, TauxRecommandation);
		this.TarifBase = 0.5;
		this.Caract�reUrgence = "Ordinaire";
	}
	
	public String SetLettreUrgente() {
		return this.Caract�reUrgence = "Urgente";
	}
	
	@Override
	public double TarifAffranchissement() {
		if ( this.Caract�reUrgence == "Urgente") {
			return this.TarifBase += 0.3;
		} else if ( this.getTauxRecommandation() == 1.0) {
			return this.TarifBase += 0.5;
		} else if (this.getTauxRecommandation() == 2.0){
			return  this.TarifBase += 1.5;
		}
		return TarifBase;
	}
	
	@Override
	public double TarifRemboursement() {
		if ( this.getTauxRecommandation() == 0 ) {
			return this.TarifBase;
		} else if ( this.getTauxRecommandation() == 1) {
			return this.TarifBase -= 1.5;
		} else {
			return this.TarifBase -= 15;
		}
	}
	
	@Override
	public String toString() {
		return ("Lettre ["+this.getCodePostal()+" / "+this.getDestination()+" / "+this.getTauxRecommandation()+" / "+this.Caract�reUrgence);
	}
}
