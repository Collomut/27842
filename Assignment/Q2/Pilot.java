package ID_27842.q2;

public class Pilot extends Flight {
	private String pilotName;
	private String licenseNumber;
	private int experienceYears;
	public Pilot(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare);
		this.setPilotName ( pilotName);
		this.setLicenseNumber (licenseNumber);
		this.setExperienceYears ( experienceYears);
	}
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.licenseNumber = "";
        } else {
            this.licenseNumber = licenseNumber;
        }
    
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		if (experienceYears < 2) {
            System.out.println(" Must be 2 or more");
            this.experienceYears = 2;
        } else {
            this.experienceYears = experienceYears;
        }
    }
	
}
