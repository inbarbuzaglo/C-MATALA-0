package Scanning;



public class line {
	private StartLine startLine;
	private Position pos;
	private WifiData wifi;

	public line(StartLine startLine, Position pos, WifiData wifi) {
		this.startLine = startLine;
		this.pos = pos;
		this.wifi = wifi;
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

	public WifiData getWifi() {
		return wifi;
	}

	public void setWifi(WifiData wifi) {
		this.wifi = wifi;
	}

	public void print() {
		System.out.println(startLine.toString() + ";" + wifi.toString() + ";" + pos.toString());
	}
	

}
