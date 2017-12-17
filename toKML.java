package ToKML;



	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	import de.micromata.opengis.kml.v_2_2_0.Document;
	import de.micromata.opengis.kml.v_2_2_0.Kml;

	public class toKML {
		static FileWriter writer;
		static String FILENAME = "C://test/test.csv/";
		static File f;
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
				kml.marshal(new File("C:/Users/dimos/Desktop/hw/console/output/outputkml.kml"));
				System.out.println("KML file has been generated, check output folder.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


