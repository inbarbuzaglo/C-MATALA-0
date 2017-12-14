package Headline_Obj;

/**
 * 
 * @author Inbar
 * 
 *This class represents a Wifi point. These parameters will repeat themselves up to 10 times.
 */

public class WifiData {
	
	private String SSID;
	private String MAC;
	private int Frequncy;
	private int RSSI;


	public WifiData() {
		this.SSID="";
		this.MAC="";
		this.Frequncy=0;
		this.RSSI=0;
	}

	public WifiData(String ssID, String mac, String frequncy, String RSSI) {
		this.SSID = ssID;
		this.MAC = mac;
		this.Frequncy = Integer.parseInt(frequncy);
		this.RSSI = Integer.parseInt(RSSI);
	}

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String ssID) {
		SSID = ssID;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mac) {
		MAC = mac;
	}

	public int getFrequncy() {
		return Frequncy;
	}

	public void setFrequncy(int frequncy) {
		Frequncy = frequncy;
	}

	public int getRSSI() {
		return RSSI;
	}

	public void setRSSI(int RSSI) {
		this.RSSI = RSSI;
	}

	public String toString() {
		return "WifiData [SSID=" + SSID + ", MAC=" + MAC + ", Frequncy=" + Frequncy + ", RSSI=" + RSSI + "]";
	}
	public String toCsv() {
		return SSID + "," + MAC + "," + Frequncy + "," + RSSI + "," ;
	}
}

