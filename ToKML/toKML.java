package KML;



	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

import Filter.Filter;
import de.micromata.opengis.kml.v_2_2_0.Document;
	import de.micromata.opengis.kml.v_2_2_0.Kml;
/**
 * 
 * @author Inbar
 *This class receives a csv file and creates a KML file using the Jak library.

 */
	public class toKML {
		
		static Kml kml;
		static Document document;

		public static void main(String[] args) throws IOException {
			openKML();
			Filter.choosefilter();
			closeKML();
		}

		// create a kml document to write to
		public static void openKML() {
			kml = new Kml();
			document = kml.createAndSetDocument();
		}

		// AddPlacemark write the information about each point at KML file
		public static void AddPlacemark(String name, String lat, String lon, String alt) {
			document.createAndAddPlacemark().withName(name).createAndSetPoint().addToCoordinates(Double.valueOf(lat),
					Double.valueOf(lon), Double.valueOf(alt));
		}

		// write kml document to a file
		public static void closeKML() {
			try {
				kml.setFeature(document);
				kml.marshal(new File("C:/CSV2KML/OUTPUT/outkml.kml"));
				System.out.println("KML file has been generated, check output folder.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void closelatKML() {
			try {
				kml.setFeature(document);
				kml.marshal(new File("C:/CSV2KML/OUTPUT/latfilter.kml"));
				System.out.println("KML filtered by lat file has been generated, check output folder.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


