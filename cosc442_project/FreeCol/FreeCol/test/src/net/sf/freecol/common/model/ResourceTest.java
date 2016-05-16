package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

public class ResourceTest extends FreeColTestCase  {
	
	public Game g;
	public Tile a;
	public ResourceType t;
	public GoodsType gt;
	public TileType tt;

	

	public void testConstructor3() 
	{
		
		String id = "Test ID"; 
		
		Game g = new Game();
		
		Resource r = new Resource(g, id);
		
		assertNotNull(r);
		
		
		
	}
	
	public void testProduceGoods(){
		GoodsType gt = null;
		assertFalse("",false);
	}
	
}