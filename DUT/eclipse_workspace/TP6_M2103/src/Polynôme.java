public class Polynôme {

	/*(P1) getMonôme(polynômeNul, e) = unMonôme(0, e)
	 * 
	 */
	
	/**
	 * construit un polynôme nul
	 */
	public Polynôme() {
		
	}
	
	/**
	 * Modifie les monômes du polynôme
	 * 
	 * @param m
	 * 		
	 */
	public void SetMonôme(Monome m) {
		{}
	}
	
	/**
	 * retroune un monôme du polynôme
	 * 
	 * @param x
	 * 		entier qui détermine la position du monôme 
	 * 		dans le polynôme
	 * @return un Monôme
	 * 
	 * @throws IllegalArgumentException
	 * 		si Exposant du monôme < 0 
	 */
	public Monome getMonôme(int x) throws IllegalArgumentException {
		return null;
	}
	
	/** 
	 * calcul la somme de 2 polynômes
	 * 
	 * @param p
	 * 		second polynôme
	 * @return Polynôme résultat
	 */
	public Polynôme somme(Polynôme p) {
		return null;
	}
	
	/**
	 * calcul le produit d'un polynôme et d'un monôme
	 * 
	 * @param m
	 * 		Mônome multiplié avec le polynôme
	 * @return Polynôme résultat
	 */
	public Polynôme produit(Monome m) {
		return null;
	}
	 
	/**
	 * retourne la dérivée du polynôme
	 * 
	 * @return Polynôme résultat
	 */
	public Polynôme dérivée() {
		return null;
	}
}
