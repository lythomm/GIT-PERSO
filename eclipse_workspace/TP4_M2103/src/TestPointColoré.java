import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPointColoré {

	private Point p;
	private Couleur c;
	
	@Before
	public void setUp() throws Exception{
		this.c = new Couleur(1,2,3);
		this.p = new Point(1.0F,5.0F);
	}
	
	@After
	public void tearDown() throws Exception {
		this.c = null;
		this.p = null;
	}
	
	@Test
	

}
