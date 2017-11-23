package test;



import java.io.FileNotFoundException;


import org.junit.Test;


import matala0.Position;

public class posFilterTest {

	@Test
	public void test() throws FileNotFoundException 
	{
		  junit test=new junit();
		  Position p=new Position(34.0,33.0,20);
          test.posFilter(p);
		
	} 
	
	
	}



