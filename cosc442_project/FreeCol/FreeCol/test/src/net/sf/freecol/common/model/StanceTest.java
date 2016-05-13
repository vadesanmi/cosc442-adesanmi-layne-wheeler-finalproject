package net.sf.freecol.common.model;
import net.sf.freecol.util.test.FreeColTestCase;


public class StanceTest extends FreeColTestCase {
	
	
	
	
	// Tests creting a War Stance object and then decreasing tension level so that a Cease Fire begins.
	public void testWarToCeaseFire() {
		
		Stance s = Stance.WAR;
		Tension t = new Tension(300);
		assertEquals(Stance.CEASE_FIRE,s.getStanceFromTension(t));
		
	}
	
	// Tests creting a Peace Stance object and then increasing tension level so that a War begins.
	public void testPeaceToWar() {
		
		Stance s = Stance.PEACE;
		Tension t = new Tension(1050);
		assertEquals(Stance.WAR,s.getStanceFromTension(t));
		
	}
	
	// Tests creting a Cease Fire Stance object and then decreasing tension level so that peace begins.
	public void testCeaseFireToPeace() {
			
		Stance s = Stance.CEASE_FIRE;
		Tension t = new Tension(50);
		assertEquals(Stance.PEACE,s.getStanceFromTension(t));
			
	}
	
	// Test changing Stance from an Alliance to Uncontacted
	// This is impossible so it should throw an error
	public void testGetTensionModifier1() {
		Stance s = Stance.UNCONTACTED;
		boolean caught = false;
		
		try {
			s.getTensionModifier(Stance.ALLIANCE);
		}
		catch (IllegalStateException e) {
			caught = true;
		}
		
		assertTrue(caught);
	}
	
	// Tests going from a Peace stance to another Peace Stance
	// Result should be tension modified by 0
	public void testGetTensionModifier2() {
		Stance s = Stance.PEACE;
		int tension;
		
		tension = s.getTensionModifier(Stance.PEACE);
		
		assertEquals(0,tension);
	}
	
	// Tests going from a War stance to a cease fire Stance
	// Method should return the CEASE_FIRE_MODIFIER integer. 
	public void testGetTensionModifier3() {
		Stance s = Stance.WAR;
		Tension t = new Tension();
		int tension;
		
		
		tension = s.getTensionModifier(Stance.CEASE_FIRE);
		
		assertEquals(t.CEASE_FIRE_MODIFIER,tension);
	}
	
	// Tests going from Alliance to War
	// Method should return the WAR_MODIFIER integer
	public void testGetTensionModifier4() {
		Stance s = Stance.ALLIANCE;
		Tension t = new Tension();
		int tension;
		
		tension = s.getTensionModifier(Stance.WAR);
		
		assertEquals(t.WAR_MODIFIER,tension);
	}
	
	
	
	
	
	
	

}
