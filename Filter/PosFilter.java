package Filter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import KML.toKML;
import Scanning.Position;

public class PosFilter {

	static String FILENAME = "C:/CSV2KML/OUTPUT/out.csv";
	static Scanner fileScanner;
	static String lineFromFile;
	static String[] spliter;
	
	public static void initScanners()throws FileNotFoundException{
		// load csv file
		File f = new File(FILENAME);

		fileScanner = new Scanner(f);
		fileScanner.nextLine();
		lineFromFile = fileScanner.nextLine();
		spliter = lineFromFile.split(",");
	}

	public static void posFilter(Position pos) throws FileNotFoundException {
		while (fileScanner.hasNext()) {
			lineFromFile = fileScanner.nextLine();
			spliter = lineFromFile.split(",");
			Position pos2 = new Position(spliter[2], spliter[3], spliter[4]);
			if (pos.equals(pos2)) {
				printWifiNetworks();
			}
		}
		fileScanner.close();
	
	}
	
	public static void latFilter(double lat1, double lat2)
	{
		while (fileScanner.hasNext()) {
			lineFromFile = fileScanner.nextLine();
			spliter = lineFromFile.split(",");
			Position pos2 = new Position(spliter[2], spliter[3], spliter[4]);
			double lat=pos2.getLat();
			
			if ((lat1<=lat)&&(lat<lat2)) 
			{
				printWifiNetworks();
			}
		}
		fileScanner.close();
	}
	
	public static void lonFilter(double lon1, double lon2)
	{
		while (fileScanner.hasNext()) {
			lineFromFile = fileScanner.nextLine();
			spliter = lineFromFile.split(",");
			Position pos2 = new Position(spliter[2], spliter[3], spliter[4]);
			double lon=pos2.getLon();
			System.out.println(lon);
			System.out.println(lon1);
			System.out.println(lon2);
			if ((lon1<=lon)&&(lon<lon2)) 
			{
				printWifiNetworks();
			}
		}
		fileScanner.close();
	}
	
	public static void altFilter(double alt1, double alt2)
	{
		while (fileScanner.hasNext()) {
			lineFromFile = fileScanner.nextLine();
			spliter = lineFromFile.split(",");
			Position pos2 = new Position(spliter[2], spliter[3], spliter[4]);
			double alt=pos2.getAlt();
			
			if ((alt1<=alt)&&(alt<alt2)) 
			{
				printWifiNetworks();
			}
		}
		fileScanner.close();
	}
	
	
	
	public static void printWifiNetworks() {
		for (int i = 7; i < spliter.length; i += 4) 
		{
			if (!spliter[i].isEmpty())
			{
				toKML.AddPlacemark(spliter[i], spliter[3], spliter[2], spliter[4]);
             }
		}
}  
}
