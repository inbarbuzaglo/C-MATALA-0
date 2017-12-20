package Algo;


import java.util.ArrayList;

import Al
import Algo.Algo.WeightedMean;
import Scanning.line;
import CSV.CSV;
import CSV.ListFromCSV;
/**
 * @author Inbar
 *In this class,we will revalue the location of the MAC using the information in the csv file,
 We will look for the most powerful MAC samples in the file and calculate a weighted average.
 */
public class Algo {

	static ArrayList<line> mergedfiles;
	static ArrayList<line> ListByMAC = new ArrayList<line>();
	private static String outputFilePath = "C:/test1/output/algo1.csv";
	String mac = "";

	public Algo(ArrayList<line> mergedfiles) {
		Algo.mergedfiles = ListFromCSV.sortByWifiMAC(mergedfiles);
		CSV csv = new CSV(outputFilePath);
		Position pos = new Position();
		for (int i = 0; i < mergedfiles.size(); i += ListByMAC.size()) {
			pos = new Position();
			pos = macpos(mergedfiles.get(i).getWifi().getMAC());
			csv.writeWifiNet(mergedfiles.get(i));
			if (pos != null) {
				csv.writePos(pos);
			}
			csv.writeNL();
		}
		csv.close();
	}

	public static Position macpos(String mac) {
		ListByMAC.clear();
		for (int i = 0; i < mergedfiles.size(); i++) {
			if (mergedfiles.get(i).getWifi().getMAC().equals(mac)) {
				ListByMAC.add(mergedfiles.get(i));
			}
		}
		ListByMAC = ListFromCSV.sortByWifiRSSI(ListByMAC);
		Position pos = new Position();
		if (ListByMAC.size() > 2) {
			pos = WeightedMean.Weighted(ListByMAC);
			return pos;
		}
		//System.out.println("Cannot evaluate position: " + ListByMAC.get(0).getWifi().getMAC());
		return null;

	}

}
