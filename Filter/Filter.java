
package Filter;



	import java.util.Date;
	import java.util.Scanner;

import KML.toKML;
import Scanning.Position;

import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	import java.io.File;
	import java.io.FileNotFoundException;
/**
 * 
 * @author Inbar
 *This class filters by location or date (by user request) and writes a filtered KML file.
 */
	public class Filter {

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
		
		public static void choosefilter() throws FileNotFoundException {

			

			// read user filter
			System.out.println("select the desierd filtering option:\n 1.filter by time\n 2.filter by position");
			Scanner inputScanner = new Scanner(System.in);
			int filter = inputScanner.nextInt();
			inputScanner.nextLine();
			if (filter == 1) {
				System.out.println("enter first date DD/MM/YYYY");
				String startDate = inputScanner.nextLine();
				System.out.println("enter last date DD/MM/YYYY");
				String endDate = inputScanner.nextLine();
				Filter.dateFilter(Filter.StringDateToLong(startDate), Filter.StringDateToLong(endDate));
			} else if (filter == 2) {
				System.out.println("Enter Latitude : ");
				double lat = inputScanner.nextDouble();
				inputScanner.nextLine();
				System.out.println("Enter Longitude : ");
				double lon = inputScanner.nextDouble();
				inputScanner.nextLine();
				System.out.println("Enter Altitude : ");
				int alt = inputScanner.nextInt();
				inputScanner.nextLine();
				Position pos = new Position(lat, lon, alt);
				PosFilter.posFilter(pos);
			}

			else {
				inputScanner.close();
				NonFilter();
			}

		}
		
		public static void NonFilter(){
			while (fileScanner.hasNext()) {
				lineFromFile = fileScanner.nextLine();
				spliter = lineFromFile.split(",");
				for (int i = 7; i < spliter.length; i += 4) {
					if (!spliter[i].isEmpty()) {
						toKML.AddPlacemark(spliter[i], spliter[3], spliter[2], spliter[4]);
					}
				}
			}
			fileScanner.close();
		}

		public static long StringDateToLong(String s) {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			long l = 0;
			try {
				Date date = formatter.parse(s);
				l = date.getTime();
				return l;
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return l;
		}

		// dateFilter-filtering by dates range that the user has entered
		public static void dateFilter(long l1, long l2) throws FileNotFoundException {
			Date startD = new Date(l1);
			Date endD = new Date(l1);

			while (fileScanner.hasNext()) {
				lineFromFile = fileScanner.nextLine();
				spliter = lineFromFile.split(",");
				long l3 = StringDateToLong(spliter[0]);
				Date date = new Date(l3);
				if ((date.after(startD)) && (date.before(endD)) || (date.equals(startD)) || (date.equals(endD))) {
					printWifiNetworks();
				}		
			}
			fileScanner.close();

		}
		//posFilter-filtering by Position(the user has to enter lan,lon,alt to filter)
		
		
		public static void printWifiNetworks() {
			for (int i = 7; i < spliter.length; i += 4) {
				if (!spliter[i].isEmpty()) {
					toKML.AddPlacemark(spliter[i], spliter[3], spliter[2], spliter[4]);
				}
			}
		}
	}

