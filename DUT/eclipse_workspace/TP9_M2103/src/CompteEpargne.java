public class CompteEpargne extends CompteBancaire {
    /**
     * taux d'intérêts
     */
    private float taux;

    /**
     * crée un compte épargne vide
     * 
     * @param numéro
     *            numéro du compte épargne
     * @param taux
     *            taux d'intérêts
     * @param IllegalArgumentException
     *            si t <= 0
     */
    public CompteEpargne(String numéro, float t)
            throws IllegalArgumentException {
        super(numéro);
        if (t <= 0) {
            throw new IllegalArgumentException("taux d'intérêts négatif ou nul");
        }
        this.taux = t;
    }

    /**
     * fournit le taux d'intérêts d'un compte épargne
     * 
     * @return taux d'intérêts
     */
    public float getTaux() {
        return this.taux;
    }

    /**
     * calcule les intérêts d'un compte épargne
     * 
     * @return intérêts
     */
    public float intérêts() {
        if (this.solde() > 0) {
            return this.solde() * this.getTaux();
        } else {
            return 0.0F;
        }
    }

    /**
     * ajoute à un compte épargne ses intérêts
     */
    public void ajouterIntérêts() {
        this.déposer(this.intérêts());
    }

    /**
     * fournit une version unicode d'un compte épargne
     * 
     * @return chaîne contenant le numéro concaténé au crédit concaténé au débit
     *         concaténé au taux d'intérêts
     */
    @Override
    public String toString() {
        return super.toString() + ", Taux : " + this.getTaux() * 100 + "%";
    }

}
