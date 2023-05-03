public class CompteEpargne extends CompteBancaire {
    /**
     * taux d'int�r�ts
     */
    private float taux;

    /**
     * cr�e un compte �pargne vide
     * 
     * @param num�ro
     *            num�ro du compte �pargne
     * @param taux
     *            taux d'int�r�ts
     * @param IllegalArgumentException
     *            si t <= 0
     */
    public CompteEpargne(String num�ro, float t)
            throws IllegalArgumentException {
        super(num�ro);
        if (t <= 0) {
            throw new IllegalArgumentException("taux d'int�r�ts n�gatif ou nul");
        }
        this.taux = t;
    }

    /**
     * fournit le taux d'int�r�ts d'un compte �pargne
     * 
     * @return taux d'int�r�ts
     */
    public float getTaux() {
        return this.taux;
    }

    /**
     * calcule les int�r�ts d'un compte �pargne
     * 
     * @return int�r�ts
     */
    public float int�r�ts() {
        if (this.solde() > 0) {
            return this.solde() * this.getTaux();
        } else {
            return 0.0F;
        }
    }

    /**
     * ajoute � un compte �pargne ses int�r�ts
     */
    public void ajouterInt�r�ts() {
        this.d�poser(this.int�r�ts());
    }

    /**
     * fournit une version unicode d'un compte �pargne
     * 
     * @return cha�ne contenant le num�ro concat�n� au cr�dit concat�n� au d�bit
     *         concat�n� au taux d'int�r�ts
     */
    @Override
    public String toString() {
        return super.toString() + ", Taux : " + this.getTaux() * 100 + "%";
    }

}
