package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

public class TurnTest extends FreeColTestCase  {


public void testConstructor1() {
		
		int turn = 1;
		
		Turn t = new Turn(turn);
		
		assertNotNull(t);
		
	}
	

	

	
	// Tests to make sure the toString works and returns the ID and the boolean value of the ability object
	public void testToString() {
		
		int turn = 1;
	
		
		Turn t = new Turn(turn);
		
		String s = t.toString();
		String expected = "1";
		
		assertTrue(s.equals(expected));
		
	}
	
	// Tests to see if two of the same ability objects are equal
	public void testEquals() {
		
		int turn = 1;
		
		Turn a = new Turn(turn);
		
		Turn b = new Turn(turn);
		
		assertTrue(a.equals(b));
		
	}
}