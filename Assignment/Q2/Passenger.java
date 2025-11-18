package ID_27842.q2;

public class Passenger extends CabinCrew  {
	private String passengerName;
	private int age;
	private String gender;
	private int contact;
	public Passenger(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName,
			String role, String shift, String passengerName, int age, String gender, int contact) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName,
				role, shift);
		this.setPassengerName ( passengerName);
		this.setAge (age);
		this.setGender (gender);
		this.setContact ( contact);
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
	       if (age <= 0) {
	            System.out.println("⚠️ Validation FAILED for Age: Must be > 0. Setting to 1.");
	            this.age = 1;
	        } else {
	            this.age = age;
	        }
	    }
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
}
