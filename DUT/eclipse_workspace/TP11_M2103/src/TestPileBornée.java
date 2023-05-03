import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPileBornée {

	private PileBornee p;
	
	@Before
	public void setUp() {
		this.p = new PileBornee(3);
	}
	
	@After 
	public void tearDown() {
		this.p = null;
	}
	
	@Test 
	public void testMaxSizeAprèsNew() {
		assertEquals(3, this.p.getMaxSize());
	}
	
	@Test
	public void testMaxSizeAprèsPush() {
		this.p.push(5);
		assertEquals(3, this.p.getMaxSize());
		
	}
	
	@Test
	public void testisEmptyAprèsNew() {
		assertTrue(this.p.isEmpty());
	}
	
	@Test
	public void testisEmptyAprèsPush() {
		this.p.push(5);
		assertFalse(this.p.isEmpty());
	}

	@Test
	public void testgetSizeAprèsNew() {
		assertEquals(0, this.p.getSize());
	}
	
	@Test
	public void testgetSizeAprèsPush() {
		this.p.push(5);
		assertEquals(1, this.p.getSize());
		this.p.push(6);
		assertEquals(2, this.p.getSize());
		this.p.push(4);
		assertEquals(3, this.p.getSize());
		this.p.push(9);
		assertEquals(3, this.p.getSize());
	}
	
	@Test
	public void testisFullAprèsNew() {
		assertFalse(this.p.isFull());
	}
	
	@Test
	public void testisFullAprèsPush() {
		this.p.push(5);
		assertEquals(1, this.p.getSize());
		this.p.push(6);
		assertEquals(2, this.p.getSize());
		this.p.push(4);
		assertEquals(3, this.p.getSize());
		this.p.push(9);
		assertEquals(3, this.p.getSize());
		assertTrue(this.p.isFull());
	}
	
	@Test
	public void testisnotFullAprèsPush() {
		this.p.push(5);
		assertEquals(1, this.p.getSize());
		this.p.push(6);
		assertEquals(2, this.p.getSize());
		assertFalse(this.p.isFull());
	}
	
	@Test
	public void testTopisFull() throws EmptyStackException {
		this.p.push(6);
		this.p.push(8);
		this.p.push(9);
		assertTrue(this.p.isFull());
		assertEquals(9, this.p.top());
	}
	
	@Test
	public void testTopisnotFull() throws EmptyStackException {
		this.p.push(6);
		this.p.push(8);
		assertEquals(8, this.p.top());
	}
	
	@Test(expected = EmptyStackException.class)
	public void ExceptionTopVide() throws EmptyStackException {
		this.p.top();
	}
	
	@Test
	public void testPopAprèsPush() {
		this.p.push(5);
		this.p.pop();
		assertEquals(0,this.p.getSize());
	}
	
	@Test
	public void testPopAprèsPushisFull() {
		this.p.push(5);
		this.p.push(9);
		this.p.push(12);
		assertTrue(this.p.isFull());
		this.p.pop();
		assertEquals(2,this.p.getSize());
	}
	
	
	
}
