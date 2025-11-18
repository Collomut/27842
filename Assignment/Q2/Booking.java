package ID_27842.q2;

public class Booking extends Passenger {
	private String bookingDate;
	private int seatNumber;
	private String travelClass;
	public Booking(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName,
			String role, String shift, String passengerName, int age, String gender, int contact, String bookingDate,
			int seatNumber, String travelClass) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName,
				role, shift, passengerName, age, gender, contact);
		this.setBookingDate ( bookingDate);
		this.setSeatNumber (seatNumber);
		this.setTravelClass ( travelClass);
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		String tClassLower = travelClass != null ? travelClass.toLowerCase() : "";
        if (!tClassLower.equals("economy") && !tClassLower.equals("business") && !tClassLower.equals("first")) {
            System.out.println(" Must be Economy, Business, or First. Setting to 'Economy'.");
            this.travelClass = "Economy";
        } else {
            this.travelClass = travelClass;
        }
    }
	
}
