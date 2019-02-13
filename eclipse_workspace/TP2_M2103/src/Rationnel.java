
public class Rationnel {
	public static long pgcd(long a,long b) {
		while(a!=b) {
			if (a<b) {
				b=b-a;
			}
			else {
				a=a-b;
			}
		}
		return a;
	}
	
	private long numérateur;
	private long dénominateur;
	//Constructeur
	public Rationnel(long num,long den) throws IllegalArgumentException{
		this.numérateur=num;
		this.dénominateur=den;
		if (den==0) {
			throw new IllegalArgumentException("dénominateur nul");
		}
	}
	//consultation
	public long getNumérateur() {
		return this.numérateur;
	}
	public long getDénominateur() {
		return this.dénominateur;
	}
	//Modificateur
	//Evaluation
	public Rationnel réduction() {
		Rationnel résultat=new Rationnel(this.numérateur/Rationnel.pgcd(this.numérateur, this.dénominateur),this.dénominateur/Rationnel.pgcd(this.numérateur,this.dénominateur));
		return résultat;
		
	}
	public Rationnel somme(Rationnel r) {
		long Num=(this.numérateur*r.dénominateur)+(this.dénominateur*r.numérateur);
		long Den=this.dénominateur*r.dénominateur;
		Rationnel résultat=new Rationnel(Num,Den);
		return résultat;
	}
	public Rationnel produit(Rationnel r) {
		long Num=this.numérateur*r.numérateur;
		long Den=this.dénominateur*r.dénominateur;
		Rationnel résultat=new Rationnel(Num,Den);
		return résultat;
	}
	public String toString() {
		Rationnel r=this.réduction();
		return r.numérateur+"/"+r.dénominateur;
	}
	public Rationnel division(Rationnel r) {
		return new Rationnel(this.getNumérateur()*r.getDénominateur(),this.getDénominateur()*r.getNumérateur());
	}
}
