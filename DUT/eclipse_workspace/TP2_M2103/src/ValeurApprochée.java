public class ValeurApprochée {

	public static void main(String[] args) {
		Rationnel U = new Rationnel(2,1) ;
		Rationnel demi = new Rationnel(1,2);
		Rationnel a = new Rationnel(2,1);
		for(int i = 0; i < 4; i++) {
			Rationnel r = a.division(U);
			U = demi.produit(U.somme(r));
		}
		//test
		System.out.println("Valeur approchée de racine carrée de 2 = "+U.toString());
		double result = (double)(U.getNumérateur()/(double)(U.getDénominateur())) ;
		System.out.println("Valeur approchée de racine carrée de 2 = "+result);
	}
	
}
