public class Polyn�me {

	/*(P1) getMon�me(polyn�meNul, e) = unMon�me(0, e)
	 * 
	 */
	
	/**
	 * construit un polyn�me nul
	 */
	public Polyn�me() {
		
	}
	
	/**
	 * Modifie les mon�mes du polyn�me
	 * 
	 * @param m
	 * 		
	 */
	public void SetMon�me(Monome m) {
		{}
	}
	
	/**
	 * retroune un mon�me du polyn�me
	 * 
	 * @param x
	 * 		entier qui d�termine la position du mon�me 
	 * 		dans le polyn�me
	 * @return un Mon�me
	 * 
	 * @throws IllegalArgumentException
	 * 		si Exposant du mon�me < 0 
	 */
	public Monome getMon�me(int x) throws IllegalArgumentException {
		return null;
	}
	
	/** 
	 * calcul la somme de 2 polyn�mes
	 * 
	 * @param p
	 * 		second polyn�me
	 * @return Polyn�me r�sultat
	 */
	public Polyn�me somme(Polyn�me p) {
		return null;
	}
	
	/**
	 * calcul le produit d'un polyn�me et d'un mon�me
	 * 
	 * @param m
	 * 		M�nome multipli� avec le polyn�me
	 * @return Polyn�me r�sultat
	 */
	public Polyn�me produit(Monome m) {
		return null;
	}
	 
	/**
	 * retourne la d�riv�e du polyn�me
	 * 
	 * @return Polyn�me r�sultat
	 */
	public Polyn�me d�riv�e() {
		return null;
	}
}
