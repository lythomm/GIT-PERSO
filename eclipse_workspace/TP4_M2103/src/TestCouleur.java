import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCouleur {

    private Couleur c; 
    
    @Before
    public void setUp() throws Exception {         
    	this.c = new Couleur(1,2,3);     
    } 
    
    @After     
    public void tearDown() throws Exception {         
    	this.c = null;
    } 

    @Test     
    public void test() {         
    	fail("Not yet implemented");     
    }

    @Test public void testComposanteRougeConstructeur() {     
    	assertEquals(1,this.c.getRouge()); 
    } 
    
    @Test public void testComposanteVerteConstructeur() {     
    	assertEquals(2,this.c.getVert()); 
    } 
     
    @Test public void testComposanteBleuConstructeur() {     
    	assertEquals(3,this.c.getBleu()); 
    }
    
    @Test public void testComposanteRougeSetter() {     
    	this.c.setRouge(255);     
    	assertEquals(255,this.c.getRouge()); 
    } 
    
    @Test public void testComposanteVerteSetter() {     
    	this.c.setVert(255);     
    	assertEquals(255,this.c.getVert()); 
    } 
     
    @Test public void testComposanteBleuSetter() {     
    	this.c.setBleu(255);     
    	assertEquals(255,this.c.getBleu()); 
    }
    
    @Test public void testConstanteRouge() {     
    	assertEquals(255,Couleur.ROUGE.getRouge());     
    	assertEquals(0,Couleur.ROUGE.getVert());     
    	assertEquals(0,Couleur.ROUGE.getBleu()); 
    } 
    
    @Test public void testConstanteVert() {     
    	assertEquals(0,Couleur.VERT.getRouge());     
    	assertEquals(255,Couleur.VERT.getVert());     
    	assertEquals(0,Couleur.VERT.getBleu()); 
    } 
     
    @Test public void testConstanteBleu() {     
    	assertEquals(0,Couleur.BLEU.getRouge());     
    	assertEquals(0,Couleur.BLEU.getVert());     
    	assertEquals(255,Couleur.BLEU.getBleu()); 
    } 
    
    @Test public void testValeurRVB() {      
    	assertEquals(256 * 256 + 2 * 256 + 3,this.c.valeurRVB()); 
    }
    
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurNégativeComposanteRouge() {     
    	this.c.setRouge(-1); } 
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurTropGrandeComposanteRouge() {     
    	this.c.setRouge(256); } 
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurNégativeComposanteVert() {     
    	this.c.setVert(-1); } 
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurTropGrandeComposanteVert() {     
    	this.c.setVert(256); } 
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurNégativeComposanteBleu() {     
    	this.c.setBleu(-1); } 
    @Test(expected = IllegalArgumentException.class) 
    public void testValeurTropGrandeComposanteBleu() {     
    	this.c.setBleu(256); } 
}
