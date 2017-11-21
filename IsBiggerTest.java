package test;

import static org.junit.Assert.*;

import org.junit.Test;

import matala0.Position;

public class IsBiggerTest {

	@Test
	public void test() {
		  junit test=new junit();
	      Position pos1=new Position("34.0","35.0", "20");
	      Position pos2=new Position(34.0,32.0,20);
	      boolean b=test.isBigger(pos1,pos2);
	      assertTrue(b); 	     
	}

}
