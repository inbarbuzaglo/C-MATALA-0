package matala0;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Scanner;

import Headline_Obj.Position;
import Headline_Obj.StartLine;
import Headline_Obj.WifiData;
import Headline_Obj.line;
/**
 * 
 * @author Inbar
 *This class scan each file in the folder,and build an ArrayList that unites all the files.
 *The file includes the best ten Wifi singnals that were found.
 */
	public class ListFromCSV {
		
		public static ArrayList<line> mergedfiles;
		public static ArrayList<line_OUTPUT_FORMAT> outputList = new ArrayList<line_OUTPUT_FORMAT>();
		static ArrayList<line> currentWork;
		private static String outputFilePath = "C:/test1/output/out.csv";
		
		public ListFromCSV() {
			this.mergedfiles=null;
			this.currentWork=null;
		}
		
		public ListFromCSV(File folder) throws IOException { 
			mergedfiles = new ArrayList<line>();
			currentWork = new ArrayList<line>();
			listFilesForFolder(folder);
			SortByPosition();
			currentWork.add(mergedfiles.get(0));
			CSV csv = new CSV(outputFilePath,currentWork);
			CSV.writeCSVfirstLine();
			for(int i=0;i<mergedfiles.size();i++) 
			{
				while(i<mergedfiles.size()-1 && 
						mergedfiles.get(i).getPos().equals(mergedfiles.get(i+1).getPos()))
				{
					currentWork.add(mergedfiles.get(i+1));
					i++;
				}
				currentWork = sortByWifiRSSI(currentWork);
				if(currentWork.isEmpty())currentWork.add(mergedfiles.get(i));
				createOutputFormat(currentWork);
				csv.updateList(currentWork);
				csv.write();
				currentWork.clear();
			}
			csv.close();
		}

		public ArrayList<line> getMergedfiles() {
			return mergedfiles;
		}

		public  void setMergedfiles(ArrayList<line> mergedfiles) {
			ListFromCSV.mergedfiles = mergedfiles;
		}

		public static ArrayList<line> sortByWifiRSSI(ArrayList<line> list) {
			Collections.sort(list, new Comparator<line>() {
				public int compare(line o1, line o2) {
					return String.valueOf(o1.getWifi().getRSSI()).compareTo(String.valueOf(o2.getWifi().getRSSI()));
				}
			});
			return list;
		}
		
		public static ArrayList<line> sortByWifiMAC(ArrayList<line> list) {
			Collections.sort(list, new Comparator<line>() {
				public int compare(line o1, line o2) {
					return String.valueOf(o1.getWifi().getMAC()).compareTo(String.valueOf(o2.getWifi().getMAC()));
				}
			});
			return list;
		}

		// listFilesForFolder check if the files format is correct (in folder).
		// if correct- read file.                
		public static void listFilesForFolder(final File folder) throws IOException {
			File[] fileEntry = folder.listFiles();
			for (int i = 0; i < fileEntry.length; i++) {
				if ((getFileExtension(fileEntry[i].getName()).equals("csv"))
						|| (getFileExtension(fileEntry[i].getName()).equals("txt"))) {
					readfile(fileEntry[i]);
				}
			}
		}

		// read every file and add to merged arraylist
		private static void readfile(File file) {
			Scanner scanner;
			try {
				scanner = new Scanner(file);
				scanner.nextLine();
				scanner.nextLine();
				String lineFromFile;
				String[] spliter;
				while (scanner.hasNext()) {
					lineFromFile = scanner.nextLine();
					spliter = lineFromFile.split(",");
					StartLine st = new StartLine(spliter[3], "", "#wifiNetwork");
					Position pos = new Position(spliter[7], spliter[6], spliter[8]);
					WifiData WiDa = new WifiData(spliter[1], spliter[0], spliter[4], spliter[5]);
					line line = new line(st,pos,WiDa);
					mergedfiles.add(line);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		//Collection.sort uses the methods of Position to sort by position
		public void SortByPosition() {
			Collections.sort(currentWork, new Comparator<line>() {
				public int compare(line o1, line o2) {
					return o1.getPos().compareTo(o2.getPos());
				}
			});
		}
		
		// the function "help" to listFilesForFolder by sending extension
		public static String getFileExtension(String fullName) {
			String fileName = new File(fullName).getName();
			int dotIndex = fileName.lastIndexOf('.');
			return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
		}

		
		public void createOutputFormat(ArrayList<line> list){
			outputList.add(new line_OUTPUT_FORMAT(list.get(0).getStartLine(), list.get(0).getPos(), new ArrayList<WifiData>()));
			for (int i = 0; i < list.size() && i < 10; i++) {
				outputList.get(outputList.size()-1).addWifi(list.get(i).getWifi());
			}
		}
		
	}
	
