import java.util.ArrayList;
import java.util.List;

public class SacPostal {
	
	private List<ObjetPostaux> SacP;
	private double CapaciteMax;
	private double CapaciteActuelle;
	
	public SacPostal(List<ObjetPostaux> SacP, double CapaciteMax) {
		this.SacP = new ArrayList<>();
		this.CapaciteMax = CapaciteMax;
		this.CapaciteActuelle = CapaciteActuelle;
	}
	
	public double getCapaciteMax() {
		return this.CapaciteMax;
	}
	
	public List<ObjetPostaux> getListe(){
		return this.SacP;
	}
	
	public double setCapaciteMax(double Taille) {
		return this.CapaciteMax = Taille;
	}

	public void AjouterObjet(ObjetPostaux ObjP) throws IllegalArgumentException {
		if ( ObjP.getVolume() + this.CapaciteActuelle > this.CapaciteMax) {
			throw new IllegalArgumentException("Manque de place dans le sac");
		}
		this.SacP.add(ObjP);
	}
	
	public void TransferObjet(List<ObjetPostaux> SacP2) {
		
	}
}
