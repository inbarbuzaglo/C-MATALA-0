
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Scanning.Position;

public class equalsTest {

	@Test
	public void test()
	{
	      junit test=new junit();
	      Position pos1=new Position("34.0","35.0", "20");
	      Position pos2=new Position(34.0,35.0,20);
	      boolean b=test.equals(pos1,pos2);
	      assertTrue(b);    
	}

}
