import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<CompteBancaire> comptes;
	private String libellé;

	/**
	 * Ouvre une banque avec des comptes bancaires
	 * 
	 * @param libellé
	 */
	public Banque(String libellé) {
		this.libellé = libellé;
		this.comptes = new ArrayList<CompteBancaire>();
	}
	
	/**
	 * Renvoie le libellé du compte
	 * 
	 * @return
	 * 		le libellé du compte
	 */
	public String GetLibellé() {
		return this.libellé;
	}
	
	/**
	 * Ouvre un nouveau compte dans la banque
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte existe déjà ou bien que le solde versé est négatif
	 */
	public void setOuvrir(String n, float v) throws IllegalArgumentException{
		if( estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte déjà existant, création de compte impossible");
		}
		CompteBancaire c = new CompteBancaire(n);
		c.déposer(v);
		this.comptes.add(c);
	}
	
	
	/**
	 * Ferme un compte de la banque
	 * 
	 * @param n
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien que le compte possède un solde suppérieur à 0
	 */
	public void setFermer(String n) throws IllegalArgumentException {
		if( !estCompteExistant(n) || this.getCompte(n).solde() != 0.0F) {
			throw new IllegalArgumentException("Compte non existant, fermeture impossible");
		}
		for(int v = 0 ; v < this.comptes.size() ; v++) {
			if(this.comptes.get(v).getNuméro() == n) {
				this.comptes.remove(v);
			}
		}
	}
	
	/**
	 * Renvoie VRAI si le compte existe, FAUX sinon
	 * 
	 * @param n
	 * @return
	 */
	public boolean estCompteExistant(String n) {
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n || x == this.comptes.size()) {
				return (this.comptes.get(x).getNuméro() == n) ;
			}
		}
		return false;
	}
	
	/**
	 * Renvoie le compte demandé
	 * 
	 * @param n
	 * @return
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas
	 */
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
	
	
	/**
	 * Dépose de l'argent dans un compte
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien si le solde a déposé est négatif
	 */
	public void setDéposer(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte non existant et dépot négatif");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n) {
				this.getCompte(n).déposer(v);
			}
		}
	}
	
	/**
	 * Retire de l'argent du compte
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien si le retrait est négatif
	 */
	public void setRetirer(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte non existant");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNuméro() == n) {
				this.getCompte(n).retirer(v);
			}
		}
	}
	
	/**
	 * Affiche le nom de la banque et les comptes associés
	 */
	@Override
	public String toString() {
		String resultat = "[Banque : "+this.GetLibellé()+System.lineSeparator();
		int i;
		for ( i=0; i < this.comptes.size()-1; i++) {
			resultat += this.comptes.get(i).toString()+System.lineSeparator();
		}
		resultat += this.comptes.get(i).toString()+" ]";
		return resultat;
	}
	
	/**
	 * Affiche tous les comptes de la banque possédant un solde négatif
	 */
	public void afficherComptesDébiteurs() {
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).solde() < 0) {
				System.out.println(""+this.GetLibellé());
			}
		}
	}
}
