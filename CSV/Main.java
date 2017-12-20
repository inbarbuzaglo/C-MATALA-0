
import java.io.File;
import java.io.IOException;

import Algo.Algo;
import Algo.Algo2;
/**
 * 
 * @author Inbar
 *In this class we open the folder where the Wigle application files are located
 */
	public class Main {

		final static File folder = new File("C:/test1/input");
		
		public static void main(String[] args) {
			try {
				// makes arraylist from input csv file and uses CSV class to arrange by parameterms
				new ListFromCSV(folder);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Algo alg = new Algo(ListFromCSV.mergedfiles);
			Algo2 alg2 = new Algo2(ListFromCSV.outputList);
		}

	}
