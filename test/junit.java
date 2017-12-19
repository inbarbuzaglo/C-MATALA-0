package test;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import matala0.CSV;
import matala0.Filter;
import matala0.ListFromCSV;
import matala0.Position;
import matala0.line;

public class junit {
	/**
	 * this class represent junit object-
	 * included inside all functions will be testing in the JUNIT test
	 */

	//this function checking equals methode that belongs to Position class
	public boolean equals(Position p1,Position p2)
	{
		if(p1.equals(p2))
		{
			return true;
		}
		return false;

	}
	//this function checking isBigger method that belongs to Position class
	public boolean isBigger(Position p1,Position p2)
	{
		
		if(p1.isBigger(p2))
		{
			return true;
		}
		return false;
	}
	//this function checking the position filter method that belongs to Filter class
	public void posFilter(Position p) throws FileNotFoundException 
	{
		Filter.posFilter(p);
	}
	
	//this function checking if a particular line is in the new ListFromCSV as expected
	public boolean listcontains(File folder,Position pos) throws IOException
	{
		ListFromCSV list=new ListFromCSV(folder);	
		boolean b=list.getMergedfiles().contains(pos.getLat());
		return b;		
	}
	
	//this function checking the StringDateToLong function that belong to Filter class
	public long dateTolong(String S)
	{
		long l;
		l=Filter.StringDateToLong(S);
		return l;
	}
	//this function checking if the titles line written as expected
	public void firstLine ()
	{
		CSV.writeCSVfirstLine();
		System.out.println(CSV.getOutputFilePath());	
		
	}
	
	//this function checking the position Getters + toString method +Position constructor 
	public String getPosition(Position pos1)
	{
		double x=pos1.getLat();
		double y=pos1.getLon();
		double z=pos1.getAlt();
		Position pos2=new Position(x,y,z);
		return pos2.toString();
	}
	}
