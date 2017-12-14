package matala0;

import java.util.ArrayList;

import Headline_Obj.Position;
import Headline_Obj.StartLine;
import Headline_Obj.WifiData;

/**
 * 
 * @author Inbar This class represents each line in the csv file as an Object
 */
public class line_OUTPUT_FORMAT {
	private StartLine startLine;
	private Position pos;
	private ArrayList<WifiData> wifiArray = new ArrayList<WifiData>();

	public line_OUTPUT_FORMAT(StartLine startLine, Position pos, ArrayList<WifiData> WifiData) {
		this.startLine = startLine;
		this.pos = pos;
		this.wifiArray = WifiData;
	}

	public StartLine getStartLine() {
		return startLine;
	}

	public void setStartLine(StartLine startLine) {
		this.startLine = startLine;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public WifiData getWifi(int i) {
		return wifiArray.get(i);
	}

	public void setWifi(int i, WifiData wifi) {
		this.wifiArray.set(i, wifi);
	}

	public ArrayList<WifiData> getWifiArray() {
		return wifiArray;
	}

	public void addWifi(WifiData wifi) {
		this.wifiArray.add(wifi);
	}

	public void print() {
		System.out.println(startLine.toString() + ";" + pos.toString() + wifiArray.toString() + ";");
	}
	
	public int isMACexists(String mac){
		int i=0;
		for (i=0;i<wifiArray.size();i++) {
			if(wifiArray.get(i).getMAC().equals(mac)){
				return i;
			}
		}
		return -1;
	}

}
