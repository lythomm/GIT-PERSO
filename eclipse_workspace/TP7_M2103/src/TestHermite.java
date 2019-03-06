import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHermite {
	
	private Polynome[] hermite;
	
	@Before public void setUp() {
        hermite = new Polynome[10];
        hermite[0] = new Polynome();
        hermite[0].setMonome(new Monome(1, 0));
        hermite[1] = new Polynome();
        hermite[1].setMonome(new Monome(1, 1));
        Monome m1 = new Monome(1.0F, 1);
        for (int i = 2; i < 10; i++) {
            Monome m2 = new Monome(-i + 1, 0);
            Polynome terme1 = hermite[i - 1].produit(m1);
            Polynome terme2 = hermite[i - 2].produit(m2);
            hermite[i] = terme1.somme(terme2);
        }
	}
	
	@Test public void TestP1() {
        for (int i = 1; i < 10; i++) {
            assertEquals(hermite[i].dérivée().toString(), hermite[i-1].produit(new Monome(i,0)).toString());
        }
	}
	
	@Test public void TestP2() {
		Monome x = new Monome(-1, 1);
        for (int i = 1; i < 10; i++) {
            assertEquals((hermite[i].dérivée().dérivée().somme((hermite[i].dérivée().produit(x)).somme(hermite[i].produit(new Monome(i,0)))).toString()),"0");
        }
	}
}
