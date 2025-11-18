package ID_27842.q2;

public class Payment extends Booking {
	private String paymentDate;
	private String paymentMethod;
	private int amountPaid;
	public Payment(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName,
			String role, String shift, String passengerName, int age, String gender, int contact, String bookingDate,
			int seatNumber, String travelClass, String paymentDate, String paymentMethod, int amountPaid) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName,
				role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
		this.setPaymentDate (paymentDate);
		this.setPaymentMethod ( paymentMethod);
		this.setAmountPaid ( amountPaid);
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            System.out.println(" Cannot be empty, Setting to Cash");
            this.paymentMethod = "Cash";
        } else {
            this.paymentMethod = paymentMethod;
        }
    
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		if (amountPaid <= 0) {
            System.out.println(" Must be > 0");
            this.amountPaid = 1;
        } else {
            this.amountPaid = amountPaid;
        }
    }
	
	
}

