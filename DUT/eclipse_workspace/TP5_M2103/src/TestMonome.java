import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMonome {

	private Monome m;
	private Monome p;
	
	@Before
	public void SetUp() throws Exception {
		this.m = new Monome(2.0F, 3);
		this.p = new Monome(0.0F, 0);
	}
	
	@After
	public void tearDown() throws Exception {
		this.m = null;
		this.p = null;
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
		assertTrue(this.p.estNul());
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
		assertEquals(6.0F, this.m.dérivée().getCoefficient(),0);
		assertEquals(2, this.m.dérivée().getExposant());
	}
	
	@Test public void testDérivéeExposantNull() {
		assertEquals(0.0F, this.p.getCoefficient(),0.0F);
		assertEquals(0, this.p.getExposant());
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
	
	@Test public void testToString() {
		assertEquals("2.0xe3", this.m.toString());
	}
	
	@Test public void testToStringEstNul() {
		assertEquals("0", this.p.toString());
	}
	
	@Test public void testToStringExposantNul() {
		Monome y = new Monome(2.0F,0);
		assertEquals("2.0", y.toString());
	}
}
