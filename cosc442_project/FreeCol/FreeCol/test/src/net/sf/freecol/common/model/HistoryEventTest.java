package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

/**
 * The class <code>HistoryEventTest</code> contains tests for the class <code>{@link HistoryEvent}</code>.
 *
 * @generatedBy CodePro at 5/12/16 7:40 PM
 * @author Austin
 * @version $Revision: 1.0 $
 */
public class HistoryEventTest extends FreeColTestCase {
	/**
	 * Run the HistoryEvent() constructor test. Tests the default constructor for the History Event class
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 7:40 PM
	 */
	
	public void testHistoryEvent_1()
		throws Exception {

		HistoryEvent result = new HistoryEvent();

	
		assertNotNull(result);
	}

	
	/**
	 * Run the HistoryEvent(Turn,HistoryEventType,Player) constructor test.
	 * Tests the History Event constructor when having parameters of a turn, event type, and a player
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 7:40 PM
	 */
	
	public void testHistoryEvent_2()
		throws Exception {
		Turn turn = new Turn(1);
		HistoryEvent.HistoryEventType eventType = HistoryEvent.HistoryEventType.ABANDON_COLONY;
		Player player = null;

		HistoryEvent result = new HistoryEvent(turn, eventType, player);

	
		assertNotNull(result);
	}
	
	
	/*
	 * Tests the getEventType method tp see if the object is created with the correct event type
	 */
	
	
	public void testGetEventType1() {
		
		Turn turn = new Turn(1);
		HistoryEvent.HistoryEventType eventType = HistoryEvent.HistoryEventType.ABANDON_COLONY;
		Player player = null;

		HistoryEvent result = new HistoryEvent(turn, eventType, player);
		
		assertEquals(HistoryEvent.HistoryEventType.ABANDON_COLONY, result.getEventType());

		
	}
	
	/*
	 * Tests the getEventType method tp see if the object is created with the correct event type
	 */
	
	
	public void testGetEventType2() {
		
		Turn turn = new Turn(1);
		HistoryEvent.HistoryEventType eventType = HistoryEvent.HistoryEventType.DECLARE_INDEPENDENCE;
		Player player = null;

		HistoryEvent result = new HistoryEvent(turn, eventType, player);
		
		assertEquals(HistoryEvent.HistoryEventType.DECLARE_INDEPENDENCE, result.getEventType());

		
	}

	
	

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 * Tests getting the history event type from an Alliance stance object
	 */
	
	public void testGetAllianceEventTypeFromStance_1()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);
		
		
		assertEquals(HistoryEvent.HistoryEventType.FORM_ALLIANCE, result);
		
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 * Tests getting the history event type from an War stance object
	 */
	
	public void testGetWarEventTypeFromStance_2()
		throws Exception {
		Stance stance = Stance.WAR;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		assertEquals(HistoryEvent.HistoryEventType.DECLARE_WAR, result);
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 * Tests getting the history event type from an Cease Fire stance object
	 */
	
	public void testGetCeaseWarEventTypeFromStance_3()
		throws Exception {
		Stance stance = Stance.CEASE_FIRE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		assertEquals(HistoryEvent.HistoryEventType.CEASE_FIRE, result);
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 * Tests getting the history event type from an Peace stance object
	 */
	
	public void testGetPeaceEventTypeFromStance_4()
		throws Exception {
		Stance stance = Stance.PEACE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		assertEquals(HistoryEvent.HistoryEventType.MAKE_PEACE, result);
	}


	

	/**
	 * Run the String getTagName() method test.
	 * This method simply returns the XML tag name for the class so it is expected to be "historyEvent"
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 7:40 PM
	 */
	
	public void testGetTagName_1()
		throws Exception {

		String result = HistoryEvent.getTagName();

		// add additional test code here
		assertTrue(result.equalsIgnoreCase("historyEvent"));
	}
	
	/*
	 * Creates trivial history event object, then sets player ID and then checks to make sure that the event ID was set correctly
	 */
	
	
	public void testGetPlayerID() {
		
		HistoryEvent event = new HistoryEvent();
		
		event.setPlayerId("Player 1");
		
		assertTrue(event.getPlayerId().equalsIgnoreCase("Player 1"));
		
	}

	/**
	 * Run the Turn getTurn() method test.
	 * Makes sure the turn is created and not null
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 7:40 PM
	 */
	
	public void testGetTurn_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(), "TestIDString"));
		fixture.setScore(1);
		fixture.setPlayerId("");

		Turn result = fixture.getTurn();

		// add additional test code here
		assertNotNull(result);
	}

	
	
}