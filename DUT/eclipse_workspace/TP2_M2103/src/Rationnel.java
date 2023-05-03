
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
	
	private long num�rateur;
	private long d�nominateur;
	//Constructeur
	public Rationnel(long num,long den) throws IllegalArgumentException{
		this.num�rateur=num;
		this.d�nominateur=den;
		if (den==0) {
			throw new IllegalArgumentException("d�nominateur nul");
		}
	}
	//consultation
	public long getNum�rateur() {
		return this.num�rateur;
	}
	public long getD�nominateur() {
		return this.d�nominateur;
	}
	//Modificateur
	//Evaluation
	public Rationnel r�duction() {
		Rationnel r�sultat=new Rationnel(this.num�rateur/Rationnel.pgcd(this.num�rateur, this.d�nominateur),this.d�nominateur/Rationnel.pgcd(this.num�rateur,this.d�nominateur));
		return r�sultat;
		
	}
	public Rationnel somme(Rationnel r) {
		long Num=(this.num�rateur*r.d�nominateur)+(this.d�nominateur*r.num�rateur);
		long Den=this.d�nominateur*r.d�nominateur;
		Rationnel r�sultat=new Rationnel(Num,Den);
		return r�sultat;
	}
	public Rationnel produit(Rationnel r) {
		long Num=this.num�rateur*r.num�rateur;
		long Den=this.d�nominateur*r.d�nominateur;
		Rationnel r�sultat=new Rationnel(Num,Den);
		return r�sultat;
	}
	public String toString() {
		Rationnel r=this.r�duction();
		return r.num�rateur+"/"+r.d�nominateur;
	}
	public Rationnel division(Rationnel r) {
		return new Rationnel(this.getNum�rateur()*r.getD�nominateur(),this.getD�nominateur()*r.getNum�rateur());
	}
}
