package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import de.micromata.opengis.kml.v_2_2_0.Kml;
import matala0.Filter;
import matala0.Position;

public class junit {
	

	public boolean equals(Position p1,Position p2)
	{
		if(p1.equals(p2))
		{
			return true;
		}
		return false;

	}
	
	public boolean isBigger(Position p1,Position p2)
	{
		
		if(p1.isBigger(p2))
		{
			return true;
		}
		return false;
	}
	
	public void posFilter(Position p) throws FileNotFoundException
	{
		Filter.posFilter(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
