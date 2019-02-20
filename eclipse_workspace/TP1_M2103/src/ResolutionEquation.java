import java.util.Scanner;

public class ResolutionEquation {
	public static void main(String[] args) {
		Scanner entre = new Scanner(System.in);
		System.out.println("Entrez a");
		int a = entre.nextInt();
		System.out.println("Entrez b");
		int b = entre.nextInt();
		System.out.println("Entrez c");
		int c = entre.nextInt();
		double delta = b*b -4*a*c;
		if (delta > 0 ) {
			double x1 = (-b + Math.sqrt(delta))/ 2*a ;
			double x2 = (-b - Math.sqrt(delta))/2*a ;
			System.out.println("x1 ="+x1+" x2 ="+x2);
		}else{
			if (delta < 0) {
				System.out.println("Pas de solution car delta < 0");
			}else {
				if (delta == 0) {
					double x3 = (-b / 2*a);
					System.out.println("il n'y a qu'une seule solution qui est :"+x3);
				}
			}	
		}
		entre.close();
	}
}

