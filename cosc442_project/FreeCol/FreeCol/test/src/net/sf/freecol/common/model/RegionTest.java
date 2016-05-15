package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;
import java.util.List;

public class RegionTest extends FreeColTestCase {
	
	// Tests setting the player who discovered the region and then getting that player object back
	public void testGetDiscoveredBy() {
		
		Game g = new Game();
		
		Region r = new Region(g, "ID");
		
		Player p = new Player(g, "ID2");
		
		r.setDiscoveredBy(p);
		
		assertEquals(p,r.getDiscoveredBy());
		

	}
	
	// Tests setting the parent of a region and then getting the parent back
	public void testGetAndSetParent() {
		
		Game g = new Game();
		
		Region r = new Region(g, "ID");
		Region p = new Region(g, "ID2");
		
		r.setParent(p);
		
		assertEquals(p, r.getParent());
		
	}
	
	// Tests adding a few child nodes and seeing if they were added correctly
	public void testAddChildren() {
		
		
		Game g = new Game();
		
		Region r = new Region(g, "ID");
		Region c = new Region(g, "ID2");
		Region c1 = new Region(g, "ID3");
		Region c2 = new Region(g, "ID4");
		
		r.addChild(c);
		r.addChild(c1);
		r.addChild(c2);
		
		List<Region> list = r.getChildren();
		
		assertEquals(c2, list.get(2));
		
	}
	
	// Tests to see if the isLeaf method is working. If a Region has a child then it is not a leaf. Add child then assertFalse that it is not a leaf
	public void testIsLeaf() {
		
		Game g = new Game();
		
		Region r = new Region(g,"ID");
		Region n = new Region(g,"ID2");
		
		r.addChild(n);
		
		assertFalse(r.isLeaf());
	
	}
	
	// Tests setting the region at a specific turn and then checking to see if it was set correctly
	public void testSetAndGetDiscoveredIn() {
		
		Game g = new Game();
		
		Region r = new Region(g,"ID");	
		
		Turn t = new Turn(10);
		
		r.setDiscoveredIn(t);
		
		Turn newTurn = r.getDiscoveredIn();
		
		assertEquals(10,newTurn.getNumber());
		
	}

}
