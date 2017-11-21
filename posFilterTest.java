package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;


import matala0.Position;

public class posFilterTest {

	@Test
	public void test() 
	{
		  junit test=new junit();
		  Position p=new Position(33,34.8786141,0);
		  try {
			test.posFilter(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
