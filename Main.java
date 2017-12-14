package matala0;



	import java.io.File;
	import java.io.IOException;

	public class Main {

		final static File folder = new File("C:");
		
		public static void main(String[] args) {
			try {
				new ListFromCSV(folder);// makes arraylist from input csv file and uses CSV class to arrange by parameterms
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					Algo alg = new Algo(ListFromCSV.mergedfiles);
			Algo2 alg2 = new Algo2(ListFromCSV.outputList);
		}

	}
