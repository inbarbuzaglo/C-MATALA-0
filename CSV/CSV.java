package CSV;

import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;

import Scanning.Position;
import Scanning.WifiData;
import Scanning.line;
import Scanning.line_OUTPUT_FORMAT;
/**
 * 
 * @author Inbar
 *This class build the csv file according to the requested format.
  the first row contains headlines And below the information itself
 */
	public class CSV {

		static int MAX_WIFI_NETWORKES = 10;
		static FileWriter writer;
		private ArrayList<line> list;
		private static String outputFilePath;

		public static String getOutputFilePath() {
			return outputFilePath;
		}

		public CSV(String outputFilePath) {
			try {
				CSV.outputFilePath = outputFilePath;
				writer = new FileWriter(outputFilePath, true); // true - the writer is appendable
			} 
			catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}
		
		public CSV(String outputFilePath,ArrayList<line> list) {
			try {
				CSV.outputFilePath = outputFilePath;
				writer = new FileWriter(outputFilePath, true); // true - the writer is appendable
			} 
			catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
			this.list = list;
		}
		
		public void updateList(ArrayList<line> list) {
			this.list = list;
		}

		public void write() {
			startCsvLine(list.get(0));
			for (int i = 0; i < list.size() && i < 10; i++) {
				writeWifiNet(list.get(i));
			}
			try {
				writer.append("\r\n");
			} catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}

		// writeCSVfirstLine write the titles
		public static void writeCSVfirstLine() {
			try {
				writer.append("Time,ID,Lat,lon,Alt,#WiFi networks,");
				for (int i = 1; i <= 10; i++) {
					writer.append("SSID" + i + ",MAC" + i + ",Frequency" + i + ",Signal" + i + ",");
				}
				writer.append("\r\n");
			} catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}

		// startCsvLine write the first 6 columns of each line
		private static void startCsvLine(line line) {
			try {
				writer.append(line.getStartLine().getTime() + "," + line.getStartLine().getID() + ","
						+ line.getPos().getLat() + "," + line.getPos().getLon() + "," + line.getPos().getAlt() + ",");
				writer.append("#wifi networks,");
			} catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}

		// writeWifiNet write the information about the WIFI points scanned (up to 10)
		public void writeWifiNet(line line) {
			try
			{
				writer.append(line.getWifi().toCsv());
			} 
			catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}
		
		public void writeWifiNetArray(line_OUTPUT_FORMAT line) {
			try
			{
				for (WifiData wifi : line.getWifiArray()) {
					writer.append(wifi.toCsv());
				}
			} 
			catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}
		
		public void writePos(Position pos) {
			try
			{
				writer.append(pos.toString());
			} 
			catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}

		public void close() {
			try {
				writer.append("\r\n");
				writer.flush();
				writer.close();
				System.out.println("CSV file has been generated, check output folder.");
			} catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
			
		}

		public void writeNL() {
			try {
				writer.append("\r\n");
			} catch (IOException e) {
				System.out.println("cannot write to file at: " + outputFilePath);
				System.out.println("errorCode: " + e.getMessage());	
			}
		}

	}

