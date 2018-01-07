package Scanning;



public class Position {

	private double lat;		//LATITUDE 
	private double lon;		//LONGTITUDE 
	private double alt;		//ALTITUDE 


	public Position() {
		lat = 0.0;
		lon = 0.0;
		alt = 0.0;
	}
	

	public Position (String lat, String lon, String alt)
   {
		this.lat = Double.parseDouble(lat);
		this.lon = Double.parseDouble(lon);
		this.alt = Double.parseDouble(alt);
	}
	
	public Position (double lon, double lat, double alt)
	{
			this.lat = lat;
			this.lon = lon;
			this.alt = alt;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(int alt) {
		this.alt = alt;
	}

	public boolean equals(Position pos) {
		if ((this.lat ==pos.getLat())&&(this.lon==pos.getLon())&&(this.alt==pos.getAlt()))
		{
			return true;
		}
		return false;
	}

	public boolean isBigger(Position pos) {
		if ((this.lat >pos.getLat())&&(this.lon>pos.getLon()))
		{
			return true;
		}
		return false;
	}
	
	public String toString() {
		return lat + "," + lon + "," + alt;
	}

	public int compareTo(Position pos) {
		if ((this.lat >pos.getLat())&&(this.lon>pos.getLon()))
		{
			return 0;
		}
		return 1;
	}

}

