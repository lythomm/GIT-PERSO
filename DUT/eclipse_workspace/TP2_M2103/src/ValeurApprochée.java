public class ValeurApproch�e {

	public static void main(String[] args) {
		Rationnel U = new Rationnel(2,1) ;
		Rationnel demi = new Rationnel(1,2);
		Rationnel a = new Rationnel(2,1);
		for(int i = 0; i < 4; i++) {
			Rationnel r = a.division(U);
			U = demi.produit(U.somme(r));
		}
		//test
		System.out.println("Valeur approch�e de racine carr�e de 2 = "+U.toString());
		double result = (double)(U.getNum�rateur()/(double)(U.getD�nominateur())) ;
		System.out.println("Valeur approch�e de racine carr�e de 2 = "+result);
	}
	
}
