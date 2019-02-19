import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMonome {

	private Monome m;
	
	@Before
	public void SetUp() throws Exception {
		this.m = new Monome(2.0F, 3);
	}
	
	@After
	public void tearDown() throws Exception {
		this.m = null;
	}

	@Test public void testCoefficient() {
		assertEquals(2.0F, this.m.getCoefficient(),0.0F);
	}
	
	@Test public void testExposant() {
		assertEquals(3, this.m.getExposant());
	}
	
	@Test public void testEstNulTRUE() {
		assertFalse(this.m.estNul());
	}
	
	@Test public void testEstNulFALSE() {
		assertTrue(this.m.estNul());
	}
	
	@Test public void testSomme() {
		Monome x = new Monome(3.0F, 3);
		assertEquals(5.0F, this.m.somme(x).getCoefficient(),0);
		assertEquals(3, this.m.somme(x).getExposant());
	}
	
	@Test public void testProduit() {
		Monome x = new Monome(3.0F, 2);
		assertEquals(6.0F, this.m.produit(x).getCoefficient(),0.0F);
		assertEquals(6, this.m.produit(x).getExposant());
	}
	
	@Test public void testDérivéeExposantNonNull() {
		assertEquals(6.0F, this.m.dérivée().getCoefficient(),0.0F);
		assertEquals(2, this.m.dérivée().getExposant());
	}
	
	@Test public void testDérivéeExposantNull() {
		assertEquals(0.0F, this.m.getCoefficient(),0.0F);
		assertEquals(0, this.m.getExposant());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSommeException() {
		Monome m1 = new Monome(2.0F, 4);
		this.m.somme(m1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExposantException() {
		Monome m1 = new Monome(2.0F, -1);
	}
}
