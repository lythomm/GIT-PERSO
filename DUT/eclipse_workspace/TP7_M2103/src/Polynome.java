public class Polynome {

    /**
     * degré maximum du polynôme
     */
    public static final int DEGRE_MAX = 99;
    /**
     * tableau contenant les coefficients des monômes du polynôme
     */
    private float[] coefficients;

    /**
     * crée un polynôme nul
     */
    public Polynome() {
        // créer le tableau des coefficients
        this.coefficients = new float[Polynome.DEGRE_MAX + 1];
        // mettre à 0 tous les coefficients
        for (int i = 0; i < this.coefficients.length; i++) {
            this.coefficients[i] = 0.0F;
        }
    }

    /**
     * positionne un nouveau monôme dans un polynôme
     * 
     * @param m
     *            monôme à positionner dans le polynôme
     * @throws IllegalArgumentException
     *             si l'exposant du monôme est supérieur à DEGRE_MAX
     */
    public void setMonome(Monome m) throws IllegalArgumentException {
        if (m.getExposant() > Polynome.DEGRE_MAX) {
            throw new IllegalArgumentException("exposant du monome trop grand " + m.getExposant() + " " + m);
        }
        this.coefficients[m.getExposant()] = m.getCoefficient();
    }

    /**
     * accède à un monôme du polynôme
     * 
     * @param exposant
     *            exposant du monôme à accéder
     * @throws IllegalArgumentException
     *             si l'exposant du monôme n'est pas compris dans [0,DEGRE_MAX]
     */
    public Monome getMonome(int exposant) throws IllegalArgumentException {
        if (exposant < 0 || exposant > Polynome.DEGRE_MAX) {
            throw new IllegalArgumentException("exposant invalide " + exposant);
        }
        return new Monome(this.coefficients[exposant], exposant);
    }

    /**
     * calcule la dérivée d'un polynôme
     * 
     * @return dérivée du polynôme
     */
    public Polynome dérivée() {
    	Polynome resultat = new Polynome();
    	for (int i = 0; i < this.coefficients.length; i++) {
    		Monome derivée = this.getMonome(i).dérivée();
    		resultat.setMonome(derivée);
    	}
    	return resultat;
    }

    /**
     * calcule la somme de deux polynômes
     * 
     * @param p
     *            deuxième polynôme associé à la somme
     * @return polynôme resultat
     */
    public Polynome somme(Polynome p) {
    	Polynome resultat = new Polynome();
    	for (int i = 0; i < this.coefficients.length; i++) {
    		resultat.setMonome(this.getMonome(i).somme(p.getMonome(i)));
    	}
    	return resultat;
    }

    /**
     * calcule le produit d'un polynôme et d'un monôme
     * 
     * @param m
     *            monôme associé au produit
     * 
     * @throws IllegalArgumentException
     *             si l'exposant d'un monôme du résultat est supérieur à
     *             DEGRE_MAX
     * @return polynôme produit
     */
    public Polynome produit(Monome m) throws IllegalArgumentException {
    	Polynome resultat = new Polynome();
    	for (int i = 0; i < this.coefficients.length - 1; i++) {
        	if ( resultat.getMonome(i).getExposant() > Polynome.DEGRE_MAX ) {
        		throw new IllegalArgumentException("Exposant trop grand");
        	}
    		resultat.setMonome(this.getMonome(i).produit(m));
    	}
    	return resultat;
    }

    @Override
    public String toString() {
        String résultat = "";
        for (int i = this.coefficients.length - 2; i >= 0; i--) {
            if (!this.getMonome(i).estNul()) {
                résultat += this.getMonome(i);
            }
        }
        if (résultat.equals("")) {
            return "0";
        }
        if (résultat.charAt(1) == '-') {
            return "-" + résultat.substring(3, résultat.length());
        }
        return résultat.substring(3, résultat.length());

    }

}
