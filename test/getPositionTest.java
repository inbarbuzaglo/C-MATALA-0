package test;


	import static org.junit.Assert.*;

	import org.junit.Before;
	import org.junit.Test;

import Scanning.Position;

	public class getPositionTest {
		

		@Test
		public void Gettest() {
			junit test=new junit();
			Position pos1=new Position("34.0","35.0","10");
			String s=test.getPosition(pos1);
			System.out.println(s);
		}

	}

