package ID_27842.q2;

public class Airline extends Airport {
	private String airlineName;
	private String airlineCode;
	private String contactEmail;
	public Airline(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail) {
		super(iD, createdDate, updatedDate, airportName, code, location);
		this.setAirlineName ( airlineName);
		this.setAirlineCode ( airlineCode);
		this.setContactEmail ( contactEmail);
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		if (airlineCode == null || !airlineCode.matches("^[a-zA-Z]{2,4}$")) {
            System.out.println(" Must be 2-4 letters");
            this.airlineCode = "NA";
        } else {
            this.airlineCode = airlineCode;
        }
    }
	
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		if (contactEmail == null || !contactEmail.contains("@") || !contactEmail.contains(".")) {
            System.out.println("Invalid format");
            this.contactEmail = "N/A";
        } else {
            this.contactEmail = contactEmail;
        
    }
	}
	
}
