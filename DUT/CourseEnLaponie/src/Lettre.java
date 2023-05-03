
public class Lettre extends ObjetPostaux{

	private double TarifBase;
	private String CaractèreUrgence;
	
	public Lettre(String origine, String destination, int CodePostal, int Poids, int Volume, float TauxRecommandation, int TarifBase) {
		super(origine, destination, CodePostal, Poids, Volume, TauxRecommandation);
		this.TarifBase = 0.5;
		this.CaractèreUrgence = "Ordinaire";
	}
	
	public String SetLettreUrgente() {
		return this.CaractèreUrgence = "Urgente";
	}
	
	@Override
	public double TarifAffranchissement() {
		if ( this.CaractèreUrgence == "Urgente") {
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
		return ("Lettre ["+this.getCodePostal()+" / "+this.getDestination()+" / "+this.getTauxRecommandation()+" / "+this.CaractèreUrgence);
	}
}
