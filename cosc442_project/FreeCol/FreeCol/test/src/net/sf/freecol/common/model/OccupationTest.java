package net.sf.freecol.common.model;

import net.sf.freecol.common.model.GoodsType;
import net.sf.freecol.common.model.ProductionType;
import net.sf.freecol.common.model.WorkLocation;
import net.sf.freecol.util.test.FreeColTestCase;

public class OccupationTest extends FreeColTestCase  {
	public WorkLocation workLocation;
    public ProductionType productionType;
    public GoodsType workType;
	
	
	public void testConstructor(){
		
		WorkLocation worklocation = null;
		ProductionType productionType = null;
		GoodsType workType = null;
		Occupation o = new Occupation(worklocation, productionType, workType);
		assertNotNull(o);
	}
	
	
	
public void testToString() {
		
		//String workLocation = "workLocation";
		WorkLocation workLocation = null;
		ProductionType productionType = null;
		GoodsType workType = null;
		Occupation o = new Occupation(workLocation, productionType, workType);
		String s = o.toString();
		String expected = "[ Occupation work location]";
		if(workType != null){
	
		assertTrue(s.equals(expected));
		
	}
		else 
			assertFalse(s.equals(expected));
}
}
