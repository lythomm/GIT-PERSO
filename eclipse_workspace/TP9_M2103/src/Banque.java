import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<CompteBancaire> comptes;
	private String libellé;

	public Banque(String libellé) {
		this.libellé = libellé;
		this.comptes = new ArrayList<CompteBancaire>();
	}
	
	public String GetLibellé() {
		return this.libellé;
	}
	
	public void setOuvrir(String n, float v) throws IllegalArgumentException{
		if( estCompteExistant(n) && v < 0) {
			throw new IllegalArgumentException("Compte déjà existant, création de compte impossible");
		}
		CompteBancaire c = new CompteBancaire(n);
		c.déposer(v);
		this.comptes.add(c);
	}
	
	public void setFermer(String n) throws IllegalArgumentException {
		if( !estCompteExistant(n) && this.comptes.getCompte.solde != 0) {
			throw new IllegalArgumentException("Compte non existant, fermeture impossible");
		}
		for(int v = 0 ; v < this.comptes.size() ; v++) {
			if(this.comptes.get(v).getNuméro() == n) {
				this.comptes.remove(v);
			}
		}
	}
	
	public boolean estCompteExistant(String n) {
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n || x == this.comptes.size()) {
				return (this.comptes.get(x).getNuméro() == n) ;
			}
		}
		return false;
	}
	
	public CompteBancaire getCompte(String n) throws IllegalArgumentException {
		if ( !estCompteExistant(n) ) {
			throw new IllegalArgumentException("Compte non existant");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n ) {
				return (this.comptes.get(x)) ;
			}
		}
		return null;
	}
	
	public void setDéposer(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(this,n) && v < 0) {
			throw new IllegalArgumentException("Compte non existant et dépot négatif");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n) {
				this.(v);
			}
		}
	}
}
