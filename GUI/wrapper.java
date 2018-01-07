package GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import Algo.Algo;
import Algo.Algo2;
import CSV.ListFromCSV;
import Filter.Filter;
import ToKML.toKML;

public class wrapper {
	
	public wrapper()
	{
		
	}

	public void listfromfolder(File folder)
	{
		try {
			// makes arraylist from input csv file and uses CSV class to arrange by parameterms
			new ListFromCSV(folder);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void tokmlnone(File csv)
	{
	toKML.openKML();
	try {
		Filter.initScanners();
		Filter.NonFilter();
		toKML.closeKML();
	} catch (FileNotFoundException e) {
		System.out.println("cannot find csv input file, " + e.getMessage());
	}
	
	}
	
	public void tokmllat (File csv,String from,String to)
	{
		toKML.openKML();
		try {
			PosFilter.initScanners();
			Position posfrom=new Position(from,"2.03","20");
			Position posto=new Position(to,"2.03","20");
			PosFilter.latFilter(posfrom.getLat(),posto.getLat());
			toKML.closelatKML();
		} catch (FileNotFoundException e) {
			System.out.println("cannot find csv input file, " + e.getMessage());
		}
	}

	
	public void Algo1()
	{
		Algo alg = new Algo(ListFromCSV.mergedfiles);		
	}
	
	public void Algo2()
	{
		Algo2 alg2 = new Algo2(ListFromCSV.outputList);	
	}
	
	public void cleardata()
	{
		ListFromCSV.mergedfiles.clear();
	}
	
	

}
