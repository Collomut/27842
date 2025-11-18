package ID_27842.q2;

public class Airport extends Entity {
	private String airportName;
	private String code;
	private String location;
	private String setairportName;
	public Airport(int iD, String createdDate, String updatedDate, String airportName, String code, String location) {
		super(iD, createdDate, updatedDate);
		this.setAirportName (airportName);
		this.setCode (code);
		this.setLocation (location);
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		
		if (code==null ) {
            System.out.println(" Validation FAILED");
            this.code = "";
        } else {
            this.code = code;
        }
    }
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
