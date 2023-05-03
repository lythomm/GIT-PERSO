import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<CompteBancaire> comptes;
	private String libell�;

	/**
	 * Ouvre une banque avec des comptes bancaires
	 * 
	 * @param libell�
	 */
	public Banque(String libell�) {
		this.libell� = libell�;
		this.comptes = new ArrayList<CompteBancaire>();
	}
	
	/**
	 * Renvoie le libell� du compte
	 * 
	 * @return
	 * 		le libell� du compte
	 */
	public String GetLibell�() {
		return this.libell�;
	}
	
	/**
	 * Ouvre un nouveau compte dans la banque
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte existe d�j� ou bien que le solde vers� est n�gatif
	 */
	public void setOuvrir(String n, float v) throws IllegalArgumentException{
		if( estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte d�j� existant, cr�ation de compte impossible");
		}
		CompteBancaire c = new CompteBancaire(n);
		c.d�poser(v);
		this.comptes.add(c);
	}
	
	
	/**
	 * Ferme un compte de la banque
	 * 
	 * @param n
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien que le compte poss�de un solde supp�rieur � 0
	 */
	public void setFermer(String n) throws IllegalArgumentException {
		if( !estCompteExistant(n) || this.getCompte(n).solde() != 0.0F) {
			throw new IllegalArgumentException("Compte non existant, fermeture impossible");
		}
		for(int v = 0 ; v < this.comptes.size() ; v++) {
			if(this.comptes.get(v).getNum�ro() == n) {
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
			if(this.comptes.get(x).getNum�ro() == n || x == this.comptes.size()) {
				return (this.comptes.get(x).getNum�ro() == n) ;
			}
		}
		return false;
	}
	
	/**
	 * Renvoie le compte demand�
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
			if(this.comptes.get(x).getNum�ro() == n ) {
				return (this.comptes.get(x)) ;
			}
		}
		return null;
	}
	
	
	/**
	 * D�pose de l'argent dans un compte
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien si le solde a d�pos� est n�gatif
	 */
	public void setD�poser(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte non existant et d�pot n�gatif");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNum�ro() == n) {
				this.getCompte(n).d�poser(v);
			}
		}
	}
	
	/**
	 * Retire de l'argent du compte
	 * 
	 * @param n
	 * @param v
	 * @throws IllegalArgumentException
	 * 		si le compte n'existe pas ou bien si le retrait est n�gatif
	 */
	public void setRetirer(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(n) || v < 0) {
			throw new IllegalArgumentException("Compte non existant");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNum�ro() == n) {
				this.getCompte(n).retirer(v);
			}
		}
	}
	
	/**
	 * Affiche le nom de la banque et les comptes associ�s
	 */
	@Override
	public String toString() {
		String resultat = "[Banque : "+this.GetLibell�()+System.lineSeparator();
		int i;
		for ( i=0; i < this.comptes.size()-1; i++) {
			resultat += this.comptes.get(i).toString()+System.lineSeparator();
		}
		resultat += this.comptes.get(i).toString()+" ]";
		return resultat;
	}
	
	/**
	 * Affiche tous les comptes de la banque poss�dant un solde n�gatif
	 */
	public void afficherComptesD�biteurs() {
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).solde() < 0) {
				System.out.println(""+this.GetLibell�());
			}
		}
	}
}
