import java.util.Scanner;

public class ResolutionEquation {

	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Coefficient a :");
		float a = entrée.nextInt();
		System.out.println("Coefficient b :");
		float b = entrée.nextInt();
		System.out.println("Coefficient c :");
		float c = entrée.nextInt();
		System.out.println("Résolution de l'équation : "+a+"x^2 + "+b+"x + "+c+" = 0");
		float delta=(b*b)-(4*a*c);
		System.out.println("discriminant: "+delta);
		if (delta < 0) {
			System.out.println("Aucune solution réelle");
		}
		else if (delta == 0){
			float resultat= (-b)/(2*a);
			System.out.println("1 solution : "+resultat);
		}
		else {
			float res1= (-b+sqrt(delta))/(2*a);
			float res2= (-b-sqrt(delta))/(2*a);
		}
	
	}

}
