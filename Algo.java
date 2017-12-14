package Algo;

import java.util.ArrayList;
import Algo.WeightedMean;
import Headline_Obj.Position;
import Headline_Obj.line;
import matala0.CSV;
import matala0.ListFromCSV;

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
