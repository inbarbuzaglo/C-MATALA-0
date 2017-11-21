package matala0;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Scanner;

	import matala0.Position;
	import matala0.StartLine;
	import matala0.WifiData;
	import matala0.line;

	public class ListFromCSV {
		
		static ArrayList<line> mergedfiles;
		static ArrayList<line> currentWork;

		public ListFromCSV(File folder) throws IOException { // TODO: לטפל במה שהוא זורק
			mergedfiles = new ArrayList<line>();
			currentWork = new ArrayList<line>();
			listFilesForFolder(folder);
			SortByPosition();
			currentWork.add(mergedfiles.get(0));
			CSV csv = new CSV(currentWork);
			for(int i=0;i<mergedfiles.size();i++) {
				while(i<mergedfiles.size()-1 && mergedfiles.get(i).getPos().equals(mergedfiles.get(i+1).getPos())) {
					currentWork.add(mergedfiles.get(i+1));
					i++;
				}
				sortByWifiRSSI();
				if(currentWork.isEmpty())currentWork.add(mergedfiles.get(i));
				csv.updateList(currentWork);
				csv.write();
				currentWork.clear();
			}
			csv.close();
		}

		public void sortByWifiRSSI() {
			Collections.sort(currentWork, new Comparator<line>() {
				public int compare(line o1, line o2) {
					return String.valueOf(o1.getWifi().getRSSI()).compareTo(String.valueOf(o2.getWifi().getRSSI()));
				}
			});
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

	}

