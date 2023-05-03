import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompteBancaire {

	@Test
	public void testEqualsTRUE() {
		CompteBancaire c = new CompteBancaire("123");
		CompteBancaire d = new CompteBancaire("123");
		assertTrue(c.equals(d));
	}

	@Test
	public void testEqualsNumDiff() {
		CompteBancaire c = new CompteBancaire("123");
		CompteBancaire d = new CompteBancaire("124");
		assertFalse(c.equals(d));
	}
	
	@Test
	public void testEqualsNuméroNULL() {
		CompteBancaire c = new CompteBancaire(null);
		assertEquals(c.getNuméro(), null);
	}
	
	@Test
	public void testEqualsClasseDiff() {
		CompteEpargne c = new CompteEpargne("123",5);
		CompteBancaire d = new CompteBancaire("124");
		assertFalse(c.equals(d));
	}
	
	@Test
	public void testEqualsObjNull() {
		CompteBancaire c = new CompteBancaire("124");
		CompteBancaire d = null;
		assertFalse(c.equals(d));
	}
	
	@Test
	public void testEqualsNotNuml() {
		CompteBancaire c = new CompteBancaire("124");
		CompteBancaire d = new CompteBancaire("124");
		assertFalse(!c.equals(d));
	}
	
	@Test
	public void testEqualsNumNull2() {
		CompteBancaire c = new CompteBancaire(null);
		CompteBancaire d = new CompteBancaire("124");
		assertEquals(c.getNuméro(), null);
		assertFalse(d.equals(null));
	}
	
}
