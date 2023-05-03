import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBanque {
	
	private Banque b;
	
	@Before
	public void SetUp() throws Exception {
		this.b = new Banque("Tata");
		b.setOuvrir("111",150.0F);
	}
	
	@After
	public void tearDown() throws Exception {
		this.b = null;
	}
	
	@Test
	public void testGetLibell�() {
		assertEquals("Tata", b.GetLibell�());
	}
	
	@Test
	public void testsetOuvrir() {
		assertTrue(b.estCompteExistant("111"));
		assertEquals(b.getCompte("111").solde(),150.0F,0.0F);
	}
	
	@Test
	public void testsetFermer() {
		b.setRetirer("111", 150.0F);
		b.setFermer("111");
		assertFalse(b.estCompteExistant("111"));
	}

	@Test
	public void testCompteExistant() {
		assertTrue(b.estCompteExistant("111"));
	}
	
	@Test
	public void testCompteNonExistant() {
		assertFalse(b.estCompteExistant("222"));
	}
	
	@Test
	public void testD�poser() {
		b.setD�poser("111", 150.0F);
		assertEquals(b.getCompte("111").solde(),300.0F,0);
	}
	
	@Test
	public void testRetirer() {
		b.setRetirer("111", 50.0F);
		assertEquals(b.getCompte("111").solde(),100.0F,0);
	}
	
	@Test
	public void testGetCompte() {
		assertEquals(b.getCompte("111").toString(),"Num�ro : 111, Cr�dit : 150.0, D�bit : 0.0");
	}
	
	@Test
	public void testToString() {
		b.setOuvrir("222", 165.0F);
		assertEquals(b.toString(),"[Banque : Tata"+System.lineSeparator()+
				 "Num�ro : 111, Cr�dit : 150.0, D�bit : 0.0" +System.lineSeparator()+
				 "Num�ro : 222, Cr�dit : 165.0, D�bit : 0.0 ]");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionGetCompteNonExistant() {
		b.getCompte("222");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetOuvrirCr�ditNegatif() {
		b.setOuvrir("222", -15.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetOuvrirCompteD�j�Existant() {
		b.setOuvrir("111", 150.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetFermerCompteNonExistant() {
		b.setFermer("222");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetFermerSoldeDiffZ�ro() {
		b.setOuvrir("222",75.0F);
		b.setRetirer("222", 25.0F);
		b.setFermer("222");
	}

	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetRetirerCompteNonExistant() {
		b.setRetirer("222", 25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetRetirerD�bitN�gatif() {
		b.setRetirer("111", -25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetD�poserCompteNonExistant() {
		b.setRetirer("222", 25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetD�poserD�bitN�gatif() {
		b.setRetirer("111", -25.0F);
	}
}
