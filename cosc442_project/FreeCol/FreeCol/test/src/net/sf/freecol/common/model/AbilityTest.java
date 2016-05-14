package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

public class AbilityTest extends FreeColTestCase  {
	
	
	// Tests to make sure an ability object can be created when passing an ID, FreeColSpecObject, and a boolean value
	public void testConstructor1() {
		
		String id = "TestID";
		
		FreeColSpecObjectType f = null;
		
		Ability a = new Ability(id, f, true);
		
		assertNotNull(a);
		
	}
	
	// Tests to make sure an ability object is created when just passing an ID to the constructor
	public void testConstructor2() {
		
		Ability a = new Ability("TestID");
		
		assertNotNull(a);
				
	}
	
	// Tests to make sure an ability object is created from another ability object
	public void testConstructor3(){
		
		Ability a = new Ability("TestAbility");
		
		Ability b = new Ability(a);
		
		assertNotNull(b);
		
	}
	
	// Tests to make sure an ability abject with a value of false is set correctly
	public void testGetValue() {
		
		String id = "TestID";
		
		FreeColSpecObjectType f = null;
		
		Ability a = new Ability(id, f, false);
		
		assertFalse(a.getValue());
		
	}
	
	// Tests to make sure the toString works and returns the ID and the boolean value of the ability object
	public void testToString() {
		
		String id = "ID Code";
	
		FreeColSpecObjectType f = null;
		
		Ability a = new Ability(id, f, true);
		
		String s = a.toString();
		String expected = "[ ID Code = true ]";
		
		assertTrue(s.equals(expected));
		
	}
	
	// Tests to see if two of the same ability objects are equal
	public void testEquals() {
		
		String id = "TestID";
		
		FreeColSpecObjectType f = null;
		
		Ability a = new Ability(id, f, true);
		
		Ability b = new Ability(id, f, true);
		
		assertTrue(a.equals(b));
		
		
	}
	
	
	
	

	
}
