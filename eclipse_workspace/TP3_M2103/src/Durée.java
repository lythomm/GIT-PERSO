public class Durée {
	
	private int heure;
	private int minute;
	private int seconde;
	public Durée (int h, int m,int s) throws IllegalArgumentException {
		if ( h < 0 && m < 0 && s < 0 && m > 59 && s > 59 ) {
			throw new IllegalArgumentException("Erreur");
		}
		this.heure = h;
		this.minute = m;
		this.seconde = s;	
	}
	public int heures() {
		return this.heure;
	}
	public int minutes() {
		return this.minute;
	}
	public int secondes() {
		return this.seconde;
	}
	public boolean égal(Durée d) {
		return (this.heure == d.heure);
	}
	public boolean inf(Durée d) {
		return(this.heure < d.heure || this.heure == d.heure && this.minute < d.minute || this.heure == d.heure && this.minute == d.minute && this.seconde < d.seconde);
	}
	public void plusUneSeconde() {
		
	}
}

