package Algo;


import java.util.ArrayList;
import java.util.Comparator;
import Scanning.Position;
import CSV.CSV;
import Scanning.line_OUTPUT_FORMAT;
/**
 * In this class, we will get a number of Wifi samples, which will help us
 * revalue the user's position by a weighted center of gravity algorithm.
 * 
 * @author Inbar
 *
 */
public class Algo2 {

	private static String outputFilePath = "C:/test1/output/algo2.csv";
	static ArrayList<line_OUTPUT_FORMAT> list = new ArrayList<line_OUTPUT_FORMAT>();
	ArrayList<line_OUTPUT_FORMAT> evaluateList = new ArrayList<line_OUTPUT_FORMAT>();

	public Algo2(ArrayList<line_OUTPUT_FORMAT> list) {
		Algo2.list = list;
		Position pos;
		CSV csv = new CSV(outputFilePath);
		for (int i = 0; i < list.size(); i++) {
			pos = new Position();
			if(list.get(i).getWifiArray().size()<3){
				continue;
			}else{
				pos = func(list.get(i));
				csv.writePos(pos);
			}
			csv.writeWifiNetArray(list.get(i));
			csv.writeNL();
		}
		csv.close();
	}
	ArrayList<double[]> pi = new ArrayList<double[]>();
	public Position func(line_OUTPUT_FORMAT line) {
		evaluateList.clear();
		pi.clear();
		int c1 = 3;
		double diff;
		double weight = 1;
		double sumWeight = 1;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < line.getWifiArray().size(); j++) {
				int indexofmac = list.get(i).isMACexists(line.getWifi(j).getMAC());
				if (indexofmac == -1) {
					diff = 100;
				} else {
					if (list.get(i).getWifi(indexofmac).getRSSI() <= -120) {
						diff = 100;
					} else {
						diff = Math.abs(line.getWifi(j).getRSSI() - list.get(i).getWifi(indexofmac).getRSSI());
						if (diff < c1) {
							diff = c1;
						}
					}
				}
				weight = 10000 / ((Math.pow(diff, 0.4) * (Math.pow(line.getWifi(j).getRSSI(), 2))));
				sumWeight *= weight;
			}
			double[] nums = { i, sumWeight };
			pi.add(nums);
			sumWeight = 1;
		}
		pi.sort(new Comparator<double[]>() {
			public int compare(double[] o1, double[] o2) {
				if (o1[1] > o2[1]) return 1;
				else return -1;
			}});
		
		
		for (int i = 0; i < 3; i++) { 
			evaluateList.add(list.get((int) pi.get(i)[0]));
		}
		double[] piArr = {pi.get(0)[1],pi.get(1)[1],pi.get(2)[1]};
		Position pos = WeightedMean.Weighted(evaluateList, piArr);
		
		return pos;
		}
	

}
