import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPointColor� {

	private PointColor� c;
	
	@Before
	public void setUp() throws Exception{
		this.c = new PointColor�(5.0F,3.0F,1,2,3);
	}
	
	@After
	public void tearDown() throws Exception {
		this.c = null;
	}

	@Test
	public void testPointOrigine() {
		assertEquals(0.0F,PointColor�.POINT_ORIGINE.getAbscisse(),0.0F);
		assertEquals(0.0F,PointColor�.POINT_ORIGINE.getOrdonn�e(),0.0F);
	}
	
	@Test
	public void testGetNuanceRouge() {
		assertEquals(1,this.c.getNuanceRouge());
	}
	
	@Test
	public void testGetNuanceVert() {
		assertEquals(2,this.c.getNuanceVert());
	}
	
	@Test
	public void testGetNuanceBleu() {
		assertEquals(3,this.c.getNuanceBleu());
	}
	
	@Test
	public void testSetNuanceRouge() {
		this.c.setNuanceRouge(255);
		assertEquals(255,this.c.getNuanceRouge());
	}
	
	@Test
	public void testSetNuanceBleu() {
		this.c.setNuanceBleu(255);
		assertEquals(255,this.c.getNuanceBleu());
	}
	
	@Test
	public void testSetNuanceVert() {
		this.c.setNuanceVert(255);
		assertEquals(255,this.c.getNuanceVert());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetNuanceRougeN�gative() {
		this.c.setNuanceRouge(-1); }
    @Test(expected = IllegalArgumentException.class) 
    public void testSetNuanceRougeTropGrande() {     
    	this.c.setNuanceRouge(256); } 
	@Test(expected = IllegalArgumentException.class)
	public void testSetNuanceBleuN�gative() {
		this.c.setNuanceBleu(-1); }
    @Test(expected = IllegalArgumentException.class) 
    public void testSetNuanceBleuTropGrande() {     
    	this.c.setNuanceBleu(256); } 
	@Test(expected = IllegalArgumentException.class)
	public void testSetNuanceVerteN�gative() {
		this.c.setNuanceVert(-1); }
    @Test(expected = IllegalArgumentException.class) 
    public void testSetNuanceVerteTropGrande() {     
    	this.c.setNuanceVert(256); } 
}
