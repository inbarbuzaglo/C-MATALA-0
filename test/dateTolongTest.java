package test;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class dateTolongTest {

		@Test
		public void test() {
			junit test=new junit();
			String s="20/1/1999";
			long l=test.dateTolong(s);
			long l2=916783200000;
			assertEquals(l2, l);	
		}
		
		
			

	}

