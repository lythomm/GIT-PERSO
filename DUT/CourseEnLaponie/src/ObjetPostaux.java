
public abstract class ObjetPostaux {

	private String origine;
	private String destination;
	private int CodePostal;
	private double Poids;
	private double Volume;
	private double TauxRecommandation;
	
	public ObjetPostaux(String origine, String destination, int CodePostal, int Poids, int Volume, float TauxRecommandation) {
		this.origine = origine;
		this.destination = destination;
		this.CodePostal = CodePostal;
		this.Poids = Poids;
		this.Volume = Volume;
		this.TauxRecommandation = TauxRecommandation;
	}
	
	public abstract double TarifAffranchissement();
	
	public abstract double TarifRemboursement();
	
	public abstract String toString();
	
	public String getOrigine() {
		return this.origine;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public int getCodePostal() {
		return this.CodePostal;
	}
	
	public double getPoids() {
		return this.Poids;
	}
	
	public double getVolume() {
		return this.Volume;
	}
	
	public double getTauxRecommandation() {
		return this.TauxRecommandation;
	}
}
