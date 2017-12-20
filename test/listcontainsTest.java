package test;


	import static org.junit.Assert.*;

	import java.io.File;
	import java.io.IOException;

	import org.junit.Test;

	import Scanning.Position;


	public class listcontainsTest {

		@Test
		public void test() throws IOException {
			//
			  junit test=new junit();
			  File folder=new File("C:/CSV2KML/INPUT");
			  Position pos=new Position("34.8099448","32.16755862","61.70000076");
			  boolean b=test.listcontains(folder, pos);
			  assertTrue(b);
			  
		}

	}

