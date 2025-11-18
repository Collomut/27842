package ID_27842.q2;

public class Flight extends Airline {
	private int flightNumber;
	private String departure;
	private String destination;
	private int baseFare;
	public Flight(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
		this.setFlightNumber (flightNumber);
		this.setDeparture ( departure);
		this.setDestination ( destination);
		this.setBaseFare ( baseFare);
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		if (departure == null || departure.isEmpty()) { 
            System.out.println(" Cannot be empty"); 
            this.departure = "";
        } else { this.departure = departure; }
    
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		
		if (destination == null || destination.isEmpty()) { 
            System.out.println(" Cannot be empty"); 
            this.destination = "";
        } else { this.destination = destination; }
    }
	public int getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(int baseFare) {
		if (baseFare <= 0) {
            System.out.println(" Must be > 0");
            this.baseFare = 1;
        } else {
            this.baseFare = baseFare;
        }
    
	}
	
}
