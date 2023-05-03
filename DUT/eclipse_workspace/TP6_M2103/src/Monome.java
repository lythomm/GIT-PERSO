public class Monome {

    /**
     * coefficient du monôme
     */
    private float coefficient;

    /**
     * exposant du monôme
     */
    private int exposant;

    /**
     * construit un monôme
     * 
     * @param coefficient
     *            coefficient du monôme
     * @param exposant
     *            exposant du monôme
     * @exception IllegalArgumentException
     *                si l'exposant est négatif
     */
    public Monome(float coefficient, int exposant) throws IllegalArgumentException {
    	if ( exposant < 0 ) {
    		throw new IllegalArgumentException("Exposant négatif");
    	}
    	this.coefficient = coefficient;
    	this.exposant = exposant;
    }

    /**
     * retourne le coefficient d'un monôme
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return (this.coefficient);
    }

    /**
     * retourne l'exposant d'un monôme
     * 
     * @return exposant
     */
    public int getExposant() {
        return (this.exposant);
    }

    /**
     * calcule la somme de deux monômes
     * 
     * @param m
     *            deuxième opérande de la somme
     * @return monôme résultat
     * @exception ArithmeticException
     *                si les exposants des 2 monômes ne sont pas les mêmes
     */
    public Monome somme(Monome m) throws ArithmeticException {
    	if ( this.exposant != m.exposant) {
    		throw new ArithmeticException("Exposant différent");
    	}
    	return new Monome (this.coefficient + m.coefficient, this.exposant);
    }

    /**
     * calcule le produit de deux monômes
     * 
     * @param m
     *            deuxième opérande du produit
     * @return monôme résultat
     */
    public Monome produit(Monome m) {
        return new Monome (this.coefficient * m.coefficient, this.exposant * m.exposant);
    }

    /**
     * calcule la dérivée d'un monôme
     * 
     * @return monôme résultat
     */
    public Monome dérivée() {
        if ( this.exposant == 0 ) {
        	return new Monome (0.0F,0);
        }else{
        	return new Monome (this.coefficient * this.exposant, this.exposant - 1);
        }
    }

    /**
     * produit une version unicode d'un monôme
     * 
     * @return chaîne résultat
     */
    @Override
    public String toString() {
        if (this.estNul()) {
            return "0";
        } else {
            if (this.exposant == 0) {
                return "" + this.getCoefficient();
            }
            return "" + this.getCoefficient() + "xe" + this.getExposant();
        }
    }

    /**
     * teste si un monôme est nul
     * 
     * @return true si le monôme est nul
     */
    public boolean estNul() {
        return (this.coefficient == 0);
    }

}
