import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPoint {

	private Point p;
	
	@Before
	public void setUp() throws Exception{
		this.p = new Point(1.0F,5.0F);
	}
	
	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void testAbscisseConstructeur() {
		assertEquals(1.0F,this.p.getAbscisse(),0.0F);
	}
	
	@Test
	public void testPointOrigine() {
		assertEquals(0.0F,Point.POINT_ORIGINE.getAbscisse(),0.0F);
		assertEquals(0.0F,Point.POINT_ORIGINE.getOrdonnée(),0.0F);
	}
	
	@Test
	public void testOrdonnéeConstructeur() {
		assertEquals(5.0F,this.p.getOrdonnée(),0.0F);
	}
	
	@Test
	public void testTranslater() {
		p.translater(4.0F, 5.0F);
		assertEquals(5.0F, this.p.getAbscisse(),0.0F);
		assertEquals(10.0F, this.p.getOrdonnée(),0.0F);
	}
	
	@Test
	public void testMettreAEchelle() {
		p.mettreAEchelle(3.0F);
		assertEquals(3.0F, this.p.getAbscisse(),0.0F);
		assertEquals(15.0F, this.p.getOrdonnée(),0.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMettreAEchelleException() {
		p.mettreAEchelle(-3.0F);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMettreAEchelleException2() {
		p.mettreAEchelle(0.0F);
	}
	
}

