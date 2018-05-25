package Test;

import jpu2016.hit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HitTest {

	@Test
	public void testGetStrength() {
		final int expected = 1; 
		final Hit hit = new Hit(1, 10, TypeHit.NORMAL); 
		assertEquals(expected, hit.getStrength());	
	}

	@Test
	public void testGetRange() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTypeHit() {
		fail("Not yet implemented");
	}

}
