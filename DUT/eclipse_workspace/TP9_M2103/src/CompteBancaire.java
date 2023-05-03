public class CompteBancaire extends Compte {

	/**
     * num�ro du compte bancaire
     */
    private String num�ro;

    /**
     * cr�e un compte bancaire vide
     * 
     * @param num�ro
     *            num�ro du compte bancaire
     */
    public CompteBancaire(String num�ro) {
        this.num�ro = num�ro;
    }

    /**
     * fournit le num�ro du compte bancaire
     * 
     * @return num�ro du compte bancaire
     */
    public String getNum�ro() {
        return this.num�ro;
    }

    /**
     * fournit une version unicode d'un compte bancaire
     * 
     * @return cha�ne contenant le num�ro concat�n� au cr�dit concat�n� au d�bit
     */
    @Override
    public String toString() {
        return "Num�ro : " + this.getNum�ro() + ", " + super.toString();
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num�ro == null) ? 0 : num�ro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (num�ro == null) {
			if (other.num�ro != null)
				return false;
		} else if (!num�ro.equals(other.num�ro))
			return false;
		return true;
	}

}
