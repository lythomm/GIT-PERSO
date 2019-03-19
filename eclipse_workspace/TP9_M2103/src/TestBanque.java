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
	public void testGetLibellé() {
		assertEquals("Tata", b.GetLibellé());
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
	public void testDéposer() {
		b.setDéposer("111", 150.0F);
		assertEquals(b.getCompte("111").solde(),300.0F,0);
	}
	
	@Test
	public void testRetirer() {
		b.setRetirer("111", 50.0F);
		assertEquals(b.getCompte("111").solde(),100.0F,0);
	}
	
	@Test
	public void testGetCompte() {
		assertEquals(b.getCompte("111").toString(),"Numéro : 111, Crédit : 150.0, Débit : 0.0");
	}
	
	@Test
	public void testToString() {
		b.setOuvrir("222", 165.0F);
		assertEquals(b.toString(),"[Banque : Tata"+System.lineSeparator()+
				 "Numéro : 111, Crédit : 150.0, Débit : 0.0" +System.lineSeparator()+
				 "Numéro : 222, Crédit : 165.0, Débit : 0.0 ]");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionGetCompteNonExistant() {
		b.getCompte("222");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetOuvrirCréditNegatif() {
		b.setOuvrir("222", -15.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetOuvrirCompteDéjàExistant() {
		b.setOuvrir("111", 150.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetFermerCompteNonExistant() {
		b.setFermer("222");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetFermerSoldeDiffZéro() {
		b.setOuvrir("222",75.0F);
		b.setRetirer("222", 25.0F);
		b.setFermer("222");
	}

	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetRetirerCompteNonExistant() {
		b.setRetirer("222", 25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetRetirerDébitNégatif() {
		b.setRetirer("111", -25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetDéposerCompteNonExistant() {
		b.setRetirer("222", 25.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionSetDéposerDébitNégatif() {
		b.setRetirer("111", -25.0F);
	}
}
