package matala0;


public class StartLine {


		private String Time;
		private String ID;
		private String WifiNetwork;

		public String toString() {
			return "[Time=" + Time + ", ID=" + ID + ", WifiNetwork=" + WifiNetwork + "]";
		}

		public StartLine(String time, String iD, String wifiNetwork) {//id - option to get id
			Time = time;
			ID = iD;
			WifiNetwork = wifiNetwork;
		}

		public StartLine() {
			this.Time = null;
			this.ID = null;
			this.WifiNetwork = null;
		}

		public StartLine(StartLine other) {
			this.Time = other.Time;
			this.ID = other.ID;
			this.WifiNetwork = other.WifiNetwork;
		}

		public String getTime() {
			return Time;
		}

		public void setTime(String time) {
			Time = time;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getWifiNetwork() {
			return WifiNetwork;
		}

		public void setWifiNetwork(String wifiNetwork) {
			WifiNetwork = wifiNetwork;
		}

	}